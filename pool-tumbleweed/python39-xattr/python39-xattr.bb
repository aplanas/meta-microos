SUMMARY = "Python wrapper for extended filesystem attributes"
DESCRIPTION = "Extended attributes extend the basic attributes of files and directories \
in the file system.  They are stored as name:data pairs associated with \
file system objects (files, directories, symlinks, etc). \
 \
Extended attributes are currently only available on Darwin 8.0+ (Mac OS X 10.4) \
and Linux 2.6+. Experimental support is included for Solaris and FreeBSD."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python39-xattr-0.10.1-2.1.aarch64.rpm"
RPM_HASH = "ad1fd7ee2695a5038125a92c713d2c79ecd28c95b6156e281b228956e5c0dafdccb4dd26713023510b0340bd510cf9e70eaef00c52b9d2f523822aa4fa647ca1"

RPROVIDES:${PN} += "python3.9dist-xattr \
python39-xattr \
python3dist-xattr"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cffi \
python39-setuptools \
update-alternatives"

inherit rpm
