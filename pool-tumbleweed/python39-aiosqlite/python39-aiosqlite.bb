SUMMARY = "AsyncIO Bridge to the Standard Python sqlite3 Module"
DESCRIPTION = "aiosqlite replicates the standard sqlite3 module, but with async versions of all \
the standard connection and cursor methods, and context managers for \
automatically closing connections."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python39-aiosqlite-0.19.0-1.3.noarch.rpm"
RPM_HASH = "cc28529a9fcad437c4c3003af5da969d305c90d6c4da6d5e6238b436fc3cd654c3b37491f18a0cc282c5f903b1276d73affa4a1ebea7ad2ca0de1944a8768ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiosqlite \
python39-aiosqlite \
python3dist-aiosqlite"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
