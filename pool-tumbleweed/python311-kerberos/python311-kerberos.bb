SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python311-kerberos-1.3.1-2.3.aarch64.rpm"
RPM_HASH = "391f60e6d22da2ac8aac6ae041f428463470da0d170561e38ac784a0b4c573a88f66045a36e65794cf5a102275e62fd35bfc3a0aac3070959fee65a02cb9b880"

RPROVIDES:${PN} += "python3-kerberos \
python3.11dist-kerberos \
python311-kerberos \
python3dist-kerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
