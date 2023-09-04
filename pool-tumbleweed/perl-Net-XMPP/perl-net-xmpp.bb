SUMMARY = "XMPP Perl Library"
DESCRIPTION = "Net::XMPP is a convenient tool to use for any perl script that would like \
to utilize the XMPP Instant Messaging protocol. While not a client in and \
of itself, it provides all of the necessary back-end functions to make a \
CGI client or command-line perl client feasible and easy to use. Net::XMPP \
is a wrapper around the rest of the official Net::XMPP::xxxxxx packages. \
 \
There is are example scripts in the example directory that provide you with \
examples of very simple XMPP programs. \
 \
NOTE: The parser that the XML::Stream::Parser manpage provides, as are most \
Perl parsers, is synchronous. If you are in the middle of parsing a packet \
and call a user defined callback, the Parser is blocked until your callback \
finishes. This means you cannot be operating on a packet, send out another \
packet and wait for a response to that packet. It will never get to you. \
Threading might solve this, but as of this writing threading in Perl is not \
quite up to par yet. This issue will be revisted in the future."
LICENSE = "LGPL-2.1+"

PV = "1.05"

RPM_NAME = "perl-Net-XMPP-1.05-1.25.noarch.rpm"
RPM_HASH = "1e5e8c806f8851c49c3d5862c5f99127d29e1b571b98eebea564e7ca7b5131bc1c6e956f97b1c45b053c39f6542142a196c575036eb63318ad52a98ee139b38c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--XMPP \
perl-Net--XMPP--Client \
perl-Net--XMPP--Connection \
perl-Net--XMPP--Debug \
perl-Net--XMPP--IQ \
perl-Net--XMPP--JID \
perl-Net--XMPP--Message \
perl-Net--XMPP--Namespaces \
perl-Net--XMPP--Presence \
perl-Net--XMPP--PrivacyLists \
perl-Net--XMPP--Protocol \
perl-Net--XMPP--Roster \
perl-Net--XMPP--Stanza \
perl-Net-XMPP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Authen--SASL \
perl-Digest--SHA \
perl-XML--Stream"

inherit rpm
