SUMMARY = "W3C Markup Validator"
DESCRIPTION = "The W3C Markup Validator checks documents like HTML and XHTML for \
conformance to W3C Recommendations and other standards."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "w3c-markup-validator-1.3-10.16.noarch.rpm"
RPM_HASH = "0797653d7b56dc683cc5bf00b35941f6028399fcfcb68c2bc665d3a9a5e45fe9a0b30ee8183bcab01e0bef5edd7dcafd7e574c36fd6df6bd81853929c31026ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-w3c-markup-validator \
w3c-markup-validator"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
apache2 \
opensp \
perl-CGI \
perl-Class--Accessor \
perl-Config--General \
perl-Encode--HanExtra \
perl-Encode--JIS2K \
perl-File--Spec--Functions \
perl-HTML--Encoding \
perl-HTML--Parser \
perl-HTML--Template \
perl-HTML--Tidy \
perl-LWP--UserAgent \
perl-Net--IP \
perl-Net--hostent \
perl-SGML--Parser--OpenSP \
perl-String--Approx \
perl-URI \
perl-XML--LibXML \
w3c-markup-validator-libs"

inherit rpm
