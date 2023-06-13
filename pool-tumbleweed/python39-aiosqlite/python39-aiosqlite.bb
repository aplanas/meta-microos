SUMMARY = "AsyncIO Bridge to the Standard Python sqlite3 Module"
DESCRIPTION = "aiosqlite replicates the standard sqlite3 module, but with async versions of all \
the standard connection and cursor methods, and context managers for \
automatically closing connections."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python39-aiosqlite-0.17.0-1.8.noarch.rpm"
RPM_HASH = "8618cb493c2e45b52b9a9cfcff5adc6ce396d6cad647edc25cb5ca8d242c2c1ceea1166ec6ac844631286684ff72f136b756dd7d954bb3c3b09e79e6c924863e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiosqlite) \
python39-aiosqlite \
python3dist(aiosqlite)"

RDEPENDS:${PN} += "python(abi) \
python39"

inherit rpm
