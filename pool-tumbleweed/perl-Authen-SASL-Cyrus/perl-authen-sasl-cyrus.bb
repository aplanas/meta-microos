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

RPM_NAME = "perl-Authen-SASL-Cyrus-0.13-11.38.aarch64.rpm"
RPM_HASH = "4d2e666bb9422d143656ec6fa1964c34cb02dfb6bec0848c0c65878160505c09ea4517a96b2488e354fc6700c0984e3ce340474509bf6e30515488e9dc58b266"

RPROVIDES:${PN} += "perl(Authen::SASL::Cyrus) \
perl(Authen::SASL::Cyrus::Security) \
perl-Authen-SASL-Cyrus \
perl-Authen-SASL-Cyrus(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsasl2.so.3()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl-Authen-SASL"

inherit rpm
