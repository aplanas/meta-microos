SUMMARY = "AsyncIO Bridge to the Standard Python sqlite3 Module"
DESCRIPTION = "aiosqlite replicates the standard sqlite3 module, but with async versions of all \
the standard connection and cursor methods, and context managers for \
automatically closing connections."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python311-aiosqlite-0.17.0-1.8.noarch.rpm"
RPM_HASH = "849da9b34d6a346ed8d1775dc03752be3ca86d523aac0dcda9d65ef8eba2b97047d118f066c8087f73f286ec7ea202060b683226a40a45d837165a1ceac020b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aiosqlite \
python311-aiosqlite \
python3dist-aiosqlite"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
