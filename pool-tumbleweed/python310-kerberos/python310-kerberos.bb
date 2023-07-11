SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python310-kerberos-1.3.1-2.3.aarch64.rpm"
RPM_HASH = "0c236f04380232a4174479ec23c3de3b4eb9bcf22b022b79de16ce9c546985034fb9ff4aa11e347a21f817d0cb3a6620d1df6a191dfc1cd7a22fb28f61768d42"

RPROVIDES:${PN} += "python3.10dist-kerberos \
python310-kerberos \
python3dist-kerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
