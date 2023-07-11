SUMMARY = "High-level interface to Kerberos"
DESCRIPTION = "This Python package is a high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps the entire Kerberos.framework, \
and instead offer a limited set of functions that do what is needed for client/server \
Kerberos authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.2.4"

RPM_NAME = "python39-pykerberos-1.2.4-1.6.aarch64.rpm"
RPM_HASH = "1e6fe8db63da9e831044b366a4dec6ff3bbce9bc5c3fcc28382e38ccf9106b8fc18bd54912dd65f614875217a98504ddcc84c57423476a3c041be1c389ef7409"

RPROVIDES:${PN} += "python3.9dist-pykerberos \
python39-pykerberos \
python3dist-pykerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
