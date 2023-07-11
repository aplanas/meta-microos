SUMMARY = "High-level interface to Kerberos"
DESCRIPTION = "This Python package is a high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps the entire Kerberos.framework, \
and instead offer a limited set of functions that do what is needed for client/server \
Kerberos authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.2.4"

RPM_NAME = "python310-pykerberos-1.2.4-1.6.aarch64.rpm"
RPM_HASH = "bf1ae54a4113cb22091ab82693fd72ac85151f6f7d871888d1b3a7f7b6a7050579fe8927128997a5aa7511db94bffa9888b0a8efbceb86d66c3015b58312d79e"

RPROVIDES:${PN} += "python3.10dist-pykerberos \
python310-pykerberos \
python3dist-pykerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
