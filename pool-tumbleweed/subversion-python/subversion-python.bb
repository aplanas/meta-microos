SUMMARY = "Allows Python scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Python (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-python-1.14.2-6.2.aarch64.rpm"
RPM_HASH = "cb37b8bb66d54985221819b9d8ab5fe5ddd83162ce6f17d5f28bb8a27d6aa54db33ce9225a54b430542f6f8b00dcac08fae8803b572e2f37217c6ffc686826d3"

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
