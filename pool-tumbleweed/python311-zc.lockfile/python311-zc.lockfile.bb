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

RPM_NAME = "python311-zc.lockfile-2.0-3.3.noarch.rpm"
RPM_HASH = "9de7fddf7185eaa18ecfc2daa6e56705c6fa1817d60b613f2f1b11a49f0d1c599f7193c742367d60faf5bc62dc6dfbb16ff56e5fe1564915ef4ccf4b8615c8c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zc-lockfile \
python3-zc.lockfile \
python3.11dist-zc.lockfile \
python311-zc-lockfile \
python311-zc.lockfile \
python3dist-zc.lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
