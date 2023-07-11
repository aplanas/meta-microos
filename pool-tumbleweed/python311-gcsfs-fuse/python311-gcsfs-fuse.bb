SUMMARY = "Filesystem interface over GCS - FUSE interface"
DESCRIPTION = "File-system interface for Google Cloud Storage. \
 \
This package provides the optional FUSE interface."
LICENSE = "BSD-3-Clause"

PV = "2023.6.0"

RPM_NAME = "python311-gcsfs-fuse-2023.6.0-1.1.noarch.rpm"
RPM_HASH = "3e8e5bf7b6fa95a3b1276cc922b669934dc04a418d76c7d87ceff76927d4900dd1f7f0b6051cd2f033e31e3f886f205af02a1d9b97d92d1e5d8b7f347e4b1519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gcsfs-fuse \
python311-gcsfs-fuse"

RDEPENDS:${PN} += "python-abi \
python311-click \
python311-fusepy"

inherit rpm
