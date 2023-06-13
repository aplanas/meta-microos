SUMMARY = "High-level interface to Kerberos"
DESCRIPTION = "This Python package is a high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps the entire Kerberos.framework, \
and instead offer a limited set of functions that do what is needed for client/server \
Kerberos authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.2.4"

RPM_NAME = "python39-pykerberos-1.2.4-1.4.aarch64.rpm"
RPM_HASH = "144f517598d0f0866a382a2b1c398b39301fd1dc0b7e91431d6e9e9990945c38837a250f4d2288edf6d5deaab68f41b0d0ac2820d6a80c70698bf5ea8c4769b2"

RPROVIDES:${PN} += "python3.9dist(pykerberos) \
python39-pykerberos \
python39-pykerberos(aarch-64) \
python3dist(pykerberos)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcom_err.so.2()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
python(abi)"

inherit rpm
