SUMMARY = "High-level interface to Kerberos"
DESCRIPTION = "This Python package is a high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps the entire Kerberos.framework, \
and instead offer a limited set of functions that do what is needed for client/server \
Kerberos authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.2.4"

RPM_NAME = "python310-pykerberos-1.2.4-1.4.aarch64.rpm"
RPM_HASH = "368f1b6d69eaf015afbe5803582cfbb60f579299a05fdb9822ddfc906af64bc3a4b2e4b0a344f29d9ad70d339110feb7bb2aeab4446c791920dfff2e36709e01"

RPROVIDES:${PN} += "python3-pykerberos \
python3.10dist-pykerberos \
python310-pykerberos \
python3dist-pykerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
