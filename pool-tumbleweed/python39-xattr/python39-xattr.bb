SUMMARY = "Python wrapper for extended filesystem attributes"
DESCRIPTION = "Extended attributes extend the basic attributes of files and directories \
in the file system.  They are stored as name:data pairs associated with \
file system objects (files, directories, symlinks, etc). \
 \
Extended attributes are currently only available on Darwin 8.0+ (Mac OS X 10.4) \
and Linux 2.6+. Experimental support is included for Solaris and FreeBSD."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python39-xattr-0.10.1-1.4.aarch64.rpm"
RPM_HASH = "7bc148e32ef686cd83c73837fad1ed0a8c3b899a9f4d3d196f63547bcb17ae21b76b90a7ca2a75930bbb769d5083cabf3d30c9e1615b64a17eac5378fc0e5e7e"

RPROVIDES:${PN} += "python3.9dist(xattr) \
python39-xattr \
python39-xattr(aarch-64) \
python3dist(xattr)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-cffi \
python39-setuptools \
update-alternatives"

inherit rpm
