SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python310-kerberos-1.3.1-2.1.aarch64.rpm"
RPM_HASH = "4352409ef69726d275afaa4cc023bd1ab4846eb543968c8403962f97123902e7566e9467e33e162efa324cc137864e8651ceb502ce7db6a33adce2585edf0cbe"

RPROVIDES:${PN} += "python3-kerberos \
python3.10dist-kerberos \
python310-kerberos \
python3dist-kerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
