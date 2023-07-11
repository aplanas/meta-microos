SUMMARY = "Filesystem interface over GCS - FUSE interface"
DESCRIPTION = "File-system interface for Google Cloud Storage. \
 \
This package provides the optional FUSE interface."
LICENSE = "BSD-3-Clause"

PV = "2023.6.0"

RPM_NAME = "python310-gcsfs-fuse-2023.6.0-1.1.noarch.rpm"
RPM_HASH = "13e57f1d910c5a4de8342392b987bf41e27568268a87f78fbae8e619e29338a149fc2d3a316092edf3b63ed11f61a8eefafc8bb339a7e2ef875630c07bffc516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-gcsfs-fuse"

RDEPENDS:${PN} += "python-abi \
python310-click \
python310-fusepy"

inherit rpm
