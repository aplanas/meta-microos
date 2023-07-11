SUMMARY = "Filesystem interface over GCS - FUSE interface"
DESCRIPTION = "File-system interface for Google Cloud Storage. \
 \
This package provides the optional FUSE interface."
LICENSE = "BSD-3-Clause"

PV = "2023.6.0"

RPM_NAME = "python39-gcsfs-fuse-2023.6.0-1.1.noarch.rpm"
RPM_HASH = "0e0330d617edbf7c05c0a6b6a9ce949d1d2b9a1d41f019936a17c9711df575a994748a0b1de2bf1ba293fd079d15714383540bd7b63af7da165c0ede998dbbaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-gcsfs-fuse"

RDEPENDS:${PN} += "python-abi \
python39-click \
python39-fusepy"

inherit rpm
