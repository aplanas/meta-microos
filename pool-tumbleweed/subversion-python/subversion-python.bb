SUMMARY = "Allows Python scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Python (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-python-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "f539688557976af5c840b1b2efa3301dcd07a317eabdf5513a6e02d878f96c0626a42b3836e5ff66cdbf757ea3d5f0b035f2df21441f42b061f4215392bf8478"

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
