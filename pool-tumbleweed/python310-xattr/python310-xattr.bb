SUMMARY = "Python wrapper for extended filesystem attributes"
DESCRIPTION = "Extended attributes extend the basic attributes of files and directories \
in the file system.  They are stored as name:data pairs associated with \
file system objects (files, directories, symlinks, etc). \
 \
Extended attributes are currently only available on Darwin 8.0+ (Mac OS X 10.4) \
and Linux 2.6+. Experimental support is included for Solaris and FreeBSD."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python310-xattr-0.10.1-1.4.aarch64.rpm"
RPM_HASH = "f0f24255afea653329b2987804f426e38fd5a5df90e305b437d6274f1569f864a9bda5d69cb72210fb88aa96d47a67d070c8b8e41d515fd6cb389ff89db8d825"

RPROVIDES:${PN} += "python3-xattr \
python3.10dist(xattr) \
python310-xattr \
python310-xattr(aarch-64) \
python3dist(xattr)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-cffi \
python310-setuptools \
update-alternatives"

inherit rpm
