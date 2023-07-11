SUMMARY = "AsyncIO Bridge to the Standard Python sqlite3 Module"
DESCRIPTION = "aiosqlite replicates the standard sqlite3 module, but with async versions of all \
the standard connection and cursor methods, and context managers for \
automatically closing connections."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python310-aiosqlite-0.19.0-1.3.noarch.rpm"
RPM_HASH = "833a88a167be3af5d61029ffa284d2c26e231c784e8997451e2603d21abc020fb96eeb23e661d19522a38673dc07a4d9092898fe053a3fb0ae55cd041b957c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiosqlite \
python310-aiosqlite \
python3dist-aiosqlite"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
