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

RPM_NAME = "perl-Authen-SASL-Cyrus-0.13-11.40.aarch64.rpm"
RPM_HASH = "f306ddc1d8489d64bb8ccd0edec896d4800f6d658ca5cd7093530f62b407e82140be32918ff7e7b0841b3efd06ea7fe9c0fa0ff07c64fa38ad7fd9f5223d48e7"

RPROVIDES:${PN} += "perl-Authen--SASL--Cyrus \
perl-Authen--SASL--Cyrus--Security \
perl-Authen-SASL-Cyrus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsasl2.so.3 \
perl--MODULE-COMPAT-5.38.0 \
perl-Authen-SASL"

inherit rpm
