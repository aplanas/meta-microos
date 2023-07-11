SUMMARY = "Highlevel Subversion Python Bindings"
DESCRIPTION = "pysvn is a set of highlevel Python bindings to Subversion. pysvn \
enables tools to be written in Python that use Subversion. \
 \
Features: \
 * Supports all svn client features \
 * Supports svn transaction features required to write svn pre-commit \
   hooks \
 * Python like interface \
 * Documentation and examples provided \
 * No need to understand the Subversion C API"
LICENSE = "Apache-1.1"

PV = "1.9.20"

RPM_NAME = "python311-pysvn-1.9.20-1.8.aarch64.rpm"
RPM_HASH = "d1b00d3fa26b197c7d716a271a64601c8167f7df8adf5e716e305fe4c05131474984e7277f21e05ca65e9ae6d2f91d32eedd53dbabd43a141d964edd9792be36"

RPROVIDES:${PN} += "python3-pysvn \
python311-pysvn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libsvn-client-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
neon \
python-abi \
subversion"

inherit rpm
