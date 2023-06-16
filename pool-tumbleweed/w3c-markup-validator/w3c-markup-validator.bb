SUMMARY = "W3C Markup Validator"
DESCRIPTION = "The W3C Markup Validator checks documents like HTML and XHTML for \
conformance to W3C Recommendations and other standards."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "w3c-markup-validator-1.3-10.15.noarch.rpm"
RPM_HASH = "3e0af3e22d5afaae339bb1152e445f4ebfc5295c385f92fef1258a2965e2b5552cd34cfffddfa8100f343e2487b7522bcce08ceb15166a3b62eb73bc8d3e7b02"
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
