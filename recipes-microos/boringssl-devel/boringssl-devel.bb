SUMMARY = "Development files for BoringSSL"
DESCRIPTION = "Development files for BoringSSL - an implementation of the Secure \
Sockets Layer (SSL) and Transport Layer Security (TLS) protocols, \
derived from OpenSSL."
LICENSE = "OpenSSL"

PV = "20200921"

RPM_NAME = "boringssl-devel-20200921-2.6.aarch64.rpm"
RPM_HASH = "9a6b4e3b3797f85be78c60c6c471dd3960dc7cb734703cbd920d99e014a0ae097c8793c76cff38bf4f9922efe73d968963d65d5f644d212afe1d1119ef8ebc9e"

RPROVIDES:${PN} += "boringssl-devel boringssl-devel(aarch-64)"
RDEPENDS:${PN} += "libboringssl1"

inherit rpm
