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

RPM_NAME = "python39-pysvn-1.9.20-1.6.aarch64.rpm"
RPM_HASH = "d67ea49fff3d2be9cecd0a1fb741cec40facfd1576ae574dc264cf838bc22ea8214dc0ff07a73fefa53bd6a2737d845e9a1cdb2309ddc00b3ea71603b2611af4"

RPROVIDES:${PN} += "python39-pysvn"

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
