SUMMARY = "Filesystem specification package"
DESCRIPTION = "A specification for pythonic filesystems."
LICENSE = "BSD-3-Clause"

PV = "2023.3.0"

RPM_NAME = "python39-fsspec-2023.3.0-2.2.noarch.rpm"
RPM_HASH = "38cade074703ccb1c0efe36dc3bb2904915aa7e5b38399af27773040149a15cf416a6e6c84470be512545a4bcb68195f175ad9ba67b09b37799ec29479d1b325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fsspec) \
python39-fsspec \
python3dist(fsspec)"

RDEPENDS:${PN} += "fuse \
python(abi)"

inherit rpm
