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

RPM_NAME = "python310-zc.lockfile-2.0-3.3.noarch.rpm"
RPM_HASH = "2b70056c6a8b81e0e1e79f3816b5677c1f0baa56d233034a30f878bf939ae70f207fa38a50afe7d4eba389ad780b573c215d958305b8fd3f0fb1b644d86d6052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zc.lockfile \
python310-zc-lockfile \
python310-zc.lockfile \
python3dist-zc.lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
