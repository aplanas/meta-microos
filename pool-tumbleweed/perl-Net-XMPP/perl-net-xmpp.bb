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

RPM_NAME = "perl-Net-XMPP-1.05-1.23.noarch.rpm"
RPM_HASH = "df5829d8d7b2539c42433460959fd12ab58723c7a0e0d3b0d7b01040efeddde4bb15ff3f55fe757f647b7cd989ab70f5593863ecae98db5a34d0c3f4439a5b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::XMPP) \
perl(Net::XMPP::Client) \
perl(Net::XMPP::Connection) \
perl(Net::XMPP::Debug) \
perl(Net::XMPP::IQ) \
perl(Net::XMPP::JID) \
perl(Net::XMPP::Message) \
perl(Net::XMPP::Namespaces) \
perl(Net::XMPP::Presence) \
perl(Net::XMPP::PrivacyLists) \
perl(Net::XMPP::Protocol) \
perl(Net::XMPP::Roster) \
perl(Net::XMPP::Stanza) \
perl-Net-XMPP"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Authen::SASL) \
perl(Digest::SHA) \
perl(XML::Stream)"

inherit rpm
