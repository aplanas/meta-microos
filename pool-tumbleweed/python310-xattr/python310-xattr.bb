SUMMARY = "Python wrapper for extended filesystem attributes"
DESCRIPTION = "Extended attributes extend the basic attributes of files and directories \
in the file system.  They are stored as name:data pairs associated with \
file system objects (files, directories, symlinks, etc). \
 \
Extended attributes are currently only available on Darwin 8.0+ (Mac OS X 10.4) \
and Linux 2.6+. Experimental support is included for Solaris and FreeBSD."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python310-xattr-0.10.1-2.1.aarch64.rpm"
RPM_HASH = "543fe5bcf0efabce20151947405cd48df409927573a728f03be984fb206071a9486db727a5df9b69e2ce5f5c2139625603542e26815f394abb9039e92b5df107"

RPROVIDES:${PN} += "python3.10dist-xattr \
python310-xattr \
python3dist-xattr"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi \
python310-setuptools \
update-alternatives"

inherit rpm
