SUMMARY = "Python wrapper for extended filesystem attributes"
DESCRIPTION = "Extended attributes extend the basic attributes of files and directories \
in the file system.  They are stored as name:data pairs associated with \
file system objects (files, directories, symlinks, etc). \
 \
Extended attributes are currently only available on Darwin 8.0+ (Mac OS X 10.4) \
and Linux 2.6+. Experimental support is included for Solaris and FreeBSD."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python311-xattr-0.10.1-2.1.aarch64.rpm"
RPM_HASH = "b53d3061efaeb22945e5a0452cfe2a4e1f3939163b926702eb3527d2d99e0fc3bb03271e59742cff54fa4a7e4a7474c976c3c753c9c94a2ce35b13975a6bae1f"

RPROVIDES:${PN} += "python3-xattr \
python3.11dist-xattr \
python311-xattr \
python3dist-xattr"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cffi \
python311-setuptools \
update-alternatives"

inherit rpm
