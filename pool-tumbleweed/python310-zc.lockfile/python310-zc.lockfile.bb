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

RPM_NAME = "python310-zc.lockfile-2.0-2.8.noarch.rpm"
RPM_HASH = "bb527c1580f71008df75e883bfaa911ade82555bac0ac67afe3b6906e78b4cf8f0fe840b5b64367c77ccea9b3e96ec06c23055dacb47b6b3515e1f47cf8d2503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zc-lockfile \
python3-zc.lockfile \
python3.10dist-zc.lockfile \
python310-zc-lockfile \
python310-zc.lockfile \
python3dist-zc.lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
