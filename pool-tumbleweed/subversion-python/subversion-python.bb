SUMMARY = "Allows Python scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Python (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-python-1.14.2-6.1.aarch64.rpm"
RPM_HASH = "b6c68e7c041d8a37929d6e9eb4de42c712c0d1b3252493c253e226b9eb1f1f320bf1c714eee28c23303712e8da8986247cbda9137c0e5540e4974058fe8b20a1"

RPROVIDES:${PN} += "libsvn-swig-py-1.so.0 \
subversion-python"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
python-abi \
subversion"

inherit rpm
