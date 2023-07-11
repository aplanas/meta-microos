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

RPM_NAME = "python310-pysvn-1.9.20-1.8.aarch64.rpm"
RPM_HASH = "3af94ab431ed14b0dedfd10f05f1c146a936152df66575dd641e86215badb0f57323d67df1f4c92cb6f56ce17bd27a2a4dd9f4697b0f0ce3bbea9dbd248703b4"

RPROVIDES:${PN} += "python310-pysvn"

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
