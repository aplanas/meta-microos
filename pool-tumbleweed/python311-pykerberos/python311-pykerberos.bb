SUMMARY = "High-level interface to Kerberos"
DESCRIPTION = "This Python package is a high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps the entire Kerberos.framework, \
and instead offer a limited set of functions that do what is needed for client/server \
Kerberos authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.2.4"

RPM_NAME = "python311-pykerberos-1.2.4-1.4.aarch64.rpm"
RPM_HASH = "7d56c7080a5069eb276ec635a1f5c23f0cc3e2b2bcc98ae31285e581708910398408f89d1bf79003a9223ca6dffc98ea01ed3e672f55968e5478dd1e4a38f8bd"

RPROVIDES:${PN} += "python3.11dist(pykerberos) \
python311-pykerberos \
python311-pykerberos(aarch-64) \
python3dist(pykerberos)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcom_err.so.2()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
python(abi)"

inherit rpm
