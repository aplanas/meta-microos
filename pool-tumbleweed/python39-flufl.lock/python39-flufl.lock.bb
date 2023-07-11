SUMMARY = "NFS-safe file locking with timeouts for POSIX and Windows"
DESCRIPTION = "NFS-safe file locking with timeouts for POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "7.1.1"

RPM_NAME = "python39-flufl.lock-7.1.1-3.1.noarch.rpm"
RPM_HASH = "52f6a84184b7467d1615b1e5d69adf5c58e330755052c7480c8288fd776d9a581a6b943b4db9c9acd617f2ffbcce70e8e04da09163b1c08e6637aec0c333f09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flufl.lock \
python39-flufl.lock \
python3dist-flufl.lock"

RDEPENDS:${PN} += "python-abi \
python39-atpublic \
python39-psutil"

inherit rpm
