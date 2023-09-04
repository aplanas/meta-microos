SUMMARY = "Creates an XML Stream connection and parses return data"
DESCRIPTION = "This module provides the user with methods to connect to a remote server, \
send a stream of XML to the server, and receive/parse an XML stream from \
the server. It is primarily based work for the Etherx XML router developed \
by the Jabber Development Team. For more information about this project \
visit http://xmpp.org/protocols/streams/. \
 \
XML::Stream gives the user the ability to define a central callback that \
will be used to handle the tags received from the server. These tags are \
passed in the format defined at instantiation time. the closing tag of an \
object is seen, the tree is finished and passed to the call back function. \
What the user does with it from there is up to them. \
 \
For a detailed description of how this module works, and about the data \
structure that it returns, please view the source of Stream.pm and look at \
the detailed description at the end of the file. \
 \
NOTE: The parser that XML::Stream::Parser provides, as are most Perl \
parsers, is synchronous. If you are in the middle of parsing a packet and \
call a user defined callback, the Parser is blocked until your callback \
finishes. This means you cannot be operating on a packet, send out another \
packet and wait for a response to that packet. It will never get to you. \
Threading might solve this, but as we all know threading in Perl is not \
quite up to par yet. This issue will be revisted in the future."
LICENSE = "LGPL-2.1+"

PV = "1.24"

RPM_NAME = "perl-XML-Stream-1.24-1.26.noarch.rpm"
RPM_HASH = "53236fb35bdf2b7967696bdfcbb23d8e174a8c00164d7748388b1ce6d1edaecd3c1d5162c7c7a51381902161a95a511817f33bf16e7c00fba9829b1077ea0691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Stream \
perl-XML--Stream--IO--Select--Win32 \
perl-XML--Stream--Namespace \
perl-XML--Stream--Node \
perl-XML--Stream--Parser \
perl-XML--Stream--Parser--DTD \
perl-XML--Stream--Tools \
perl-XML--Stream--Tree \
perl-XML--Stream--XPath \
perl-XML--Stream--XPath--AllOp \
perl-XML--Stream--XPath--AndOp \
perl-XML--Stream--XPath--AttributeOp \
perl-XML--Stream--XPath--ContextOp \
perl-XML--Stream--XPath--EqualOp \
perl-XML--Stream--XPath--FunctionOp \
perl-XML--Stream--XPath--NodeOp \
perl-XML--Stream--XPath--NotEqualOp \
perl-XML--Stream--XPath--Op \
perl-XML--Stream--XPath--OrOp \
perl-XML--Stream--XPath--PositionOp \
perl-XML--Stream--XPath--Query \
perl-XML--Stream--XPath--Value \
perl-XML-Stream"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Authen--SASL"

inherit rpm
