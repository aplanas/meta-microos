SUMMARY = "Python wrapper for extended filesystem attributes"
DESCRIPTION = "Extended attributes extend the basic attributes of files and directories \
in the file system.  They are stored as name:data pairs associated with \
file system objects (files, directories, symlinks, etc). \
 \
Extended attributes are currently only available on Darwin 8.0+ (Mac OS X 10.4) \
and Linux 2.6+. Experimental support is included for Solaris and FreeBSD."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python311-xattr-0.10.1-1.4.aarch64.rpm"
RPM_HASH = "5ef708bd88d63c029f4c7acbb24f3bdab96c45f12b294262321cebdd4906c7bec4e675ad19dc04b5cf65d51c237202eebcc2a24e2002bf84ae8a85780e59c7b5"

RPROVIDES:${PN} += "python3.11dist-xattr \
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
