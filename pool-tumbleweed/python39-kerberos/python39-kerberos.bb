SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python39-kerberos-1.3.1-2.3.aarch64.rpm"
RPM_HASH = "47070faed6e80a28d344849e8d011dad65fefe7ae017a17a6eb925bcb7f0f7d0f1c65d9e331a5d20cedbfb4756a158560822d91be914b5ab6ab2f1b5fac85863"

RPROVIDES:${PN} += "python3.9dist-kerberos \
python39-kerberos \
python3dist-kerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
