SUMMARY = "High-level interface to Kerberos"
DESCRIPTION = "This Python package is a high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps the entire Kerberos.framework, \
and instead offer a limited set of functions that do what is needed for client/server \
Kerberos authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.2.4"

RPM_NAME = "python311-pykerberos-1.2.4-1.6.aarch64.rpm"
RPM_HASH = "c9b43fefc6e7e05382e26314fc24de0887449e0aec68341409137571b72916f75b62996ef03acb878e393533bc4b2b0dbc9f9112de571eaedbe518935845d984"

RPROVIDES:${PN} += "python3-pykerberos \
python3.11dist-pykerberos \
python311-pykerberos \
python3dist-pykerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
