SUMMARY = "Filesystem interface over GCS - FUSE interface"
DESCRIPTION = "File-system interface for Google Cloud Storage. \
 \
This package provides the optional FUSE interface."
LICENSE = "BSD-3-Clause"

PV = "2023.3.0"

RPM_NAME = "python39-gcsfs-fuse-2023.3.0-1.2.noarch.rpm"
RPM_HASH = "0ceff9a0c6291a0e1e73d1c6b72ae27602cfe0907f9aea7671f925b8580d2fc7d0e8ef9e69cd687595822521b27332f0ec8c59ff6922c6411b70d2c6ae7b60ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-gcsfs-fuse"
RDEPENDS:${PN} += "python(abi) \
python39-click \
python39-fusepy"

inherit rpm
