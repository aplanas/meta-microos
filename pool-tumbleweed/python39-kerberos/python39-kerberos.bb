SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python39-kerberos-1.3.1-2.1.aarch64.rpm"
RPM_HASH = "cf211ca384c5a0cf7f6d9ef116bc6f0e23c60e9a9caa354bfe6ec2f65ab9b36d0dbf68b476cba860bdc4ff11104661f93deb93c04c73560c1702c5aa7001eb0d"

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
