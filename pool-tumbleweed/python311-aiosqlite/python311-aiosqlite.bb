SUMMARY = "AsyncIO Bridge to the Standard Python sqlite3 Module"
DESCRIPTION = "aiosqlite replicates the standard sqlite3 module, but with async versions of all \
the standard connection and cursor methods, and context managers for \
automatically closing connections."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python311-aiosqlite-0.19.0-1.3.noarch.rpm"
RPM_HASH = "ae24e38cf63472f7a61798d22deb354f3d5d2a8e7753807ffcdcfc91bece64ff4709f4c385ed37f4d1e54a52fb49d5105883eb1f3b830b5a449233a708a65e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosqlite \
python3.11dist-aiosqlite \
python311-aiosqlite \
python3dist-aiosqlite"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
