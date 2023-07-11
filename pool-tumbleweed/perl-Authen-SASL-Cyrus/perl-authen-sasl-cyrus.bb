SUMMARY = "SASL Authentication Framework - Cyrus Plugin"
DESCRIPTION = "SASL is a generic mechanism for authentication used by several network \
protocols. \
 \
Authen::SASL::Cyrus is a plug-in for the Authen::SASL module and \
provides an implementation framework that all protocols should be able \
to share. \
 \
The XS framework makes calls to the existing libsasl.so shared library \
to perform SASL client connection functionality, including loading \
existing shared library mechanisms."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.13"

RPM_NAME = "perl-Authen-SASL-Cyrus-0.13-11.39.aarch64.rpm"
RPM_HASH = "65badad5fb4909b906664e20a800d8461acfa1ec5e4a3dddf20849ec4805b0af85b6fd5dedee311bf86cf9b4525b976e36bfdcde1455c5633ce4c9d61b75291c"

RPROVIDES:${PN} += "perl-Authen--SASL--Cyrus \
perl-Authen--SASL--Cyrus--Security \
perl-Authen-SASL-Cyrus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsasl2.so.3 \
perl--MODULE-COMPAT-5.36.1 \
perl-Authen-SASL"

inherit rpm
