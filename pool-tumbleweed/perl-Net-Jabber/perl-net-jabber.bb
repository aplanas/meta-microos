SUMMARY = "Jabber Perl Library"
DESCRIPTION = "Net::Jabber is a convenient tool to use for any perl script that would \
like to utilize the Jabber Instant Messaging protocol. While not a \
client in and of itself, it provides all of the necessary back-end \
functions to make a CGI client or command-line perl client feasible and \
easy to use. Net::Jabber is a wrapper around the rest of the official \
Net::Jabber::xxxxxx packages. \
 \
 \
 \
Authors: \
-------- \
    Ryan Eatmon <reatmon@ti.com>"
LICENSE = "Artistic-1.0"

PV = "2.0"

RPM_NAME = "perl-Net-Jabber-2.0-189.31.aarch64.rpm"
RPM_HASH = "27ac9984f33226c1731e84354c6ed22ef12a4bc17b9ffc0d21257551c83ae80fa4dfa4b77735f69a942d5b18e098bc5311ee2f285fd0d0250cae5cf1bf0afec4"

RPROVIDES:${PN} += "perl-Net--Jabber \
perl-Net--Jabber--Client \
perl-Net--Jabber--Component \
perl-Net--Jabber--Data \
perl-Net--Jabber--Debug \
perl-Net--Jabber--Dialback \
perl-Net--Jabber--Dialback--Result \
perl-Net--Jabber--Dialback--Verify \
perl-Net--Jabber--IQ \
perl-Net--Jabber--JID \
perl-Net--Jabber--Key \
perl-Net--Jabber--Log \
perl-Net--Jabber--Message \
perl-Net--Jabber--Namespaces \
perl-Net--Jabber--Presence \
perl-Net--Jabber--Protocol \
perl-Net--Jabber--Server \
perl-Net--Jabber--Stanza \
perl-Net--Jabber--XDB \
perl-Net-Jabber"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Authen-SASL \
perl-Digest-SHA1 \
perl-Net-XMPP \
perl-Unicode-String \
perl-XML-Stream"

inherit rpm
