SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python311-kerberos-1.3.1-2.1.aarch64.rpm"
RPM_HASH = "44642dd227a5ce20bb39e87db5a6953e49113baa8edd43f8976a3bbbd0b4015cff8f578b130e032847f07c53351352862c0ee54ce6dc1054062c403f6ab8c38a"

RPROVIDES:${PN} += "python3.11dist(kerberos) \
python311-kerberos \
python311-kerberos(aarch-64) \
python3dist(kerberos)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcom_err.so.2()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
python(abi)"

inherit rpm
