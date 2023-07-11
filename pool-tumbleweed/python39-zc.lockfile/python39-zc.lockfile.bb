SUMMARY = "Basic inter-process locks"
DESCRIPTION = "The zc.lockfile package provides a basic portable implementation of \
interprocess locks using lock files. The purpose if not specifically to lock \
files, but to simply provide locks with an implementation based on file-locking \
primitives. Of course, these locks could be used to mediate access to other \
files. For example, the ZODB file storage implementation uses file locks to \
mediate access to file-storage database files. The database files and lock file \
files are separate files."
LICENSE = "ZPL-2.1"

PV = "2.0"

RPM_NAME = "python39-zc.lockfile-2.0-3.3.noarch.rpm"
RPM_HASH = "9d4d0f8f1088ced1dda903f028546c50354aa62d13e89ec2c49c7315692bfd1a44d9ed67ccd631e45f1745c7b492e29777b003ce8d95203ad5589aeb9f832100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zc.lockfile \
python39-zc-lockfile \
python39-zc.lockfile \
python3dist-zc.lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
