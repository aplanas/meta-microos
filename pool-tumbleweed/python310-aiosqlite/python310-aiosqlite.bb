SUMMARY = "AsyncIO Bridge to the Standard Python sqlite3 Module"
DESCRIPTION = "aiosqlite replicates the standard sqlite3 module, but with async versions of all \
the standard connection and cursor methods, and context managers for \
automatically closing connections."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python310-aiosqlite-0.17.0-1.8.noarch.rpm"
RPM_HASH = "f28cd130d9b61714c22dbb70892e254e8ec22912c3b0b68d09c532e6341684e039e3a856d59085dea52798b34c16872ca5af515de49486cc31ebbc79a1c445a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosqlite \
python3.10dist-aiosqlite \
python310-aiosqlite \
python3dist-aiosqlite"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
