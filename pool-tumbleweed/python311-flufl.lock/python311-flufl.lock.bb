SUMMARY = "NFS-safe file locking with timeouts for POSIX and Windows"
DESCRIPTION = "NFS-safe file locking with timeouts for POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "7.1.1"

RPM_NAME = "python311-flufl.lock-7.1.1-2.4.noarch.rpm"
RPM_HASH = "e8c5f7061a893efa937ad0616ea3daf03ad06c55c1203256efabb46d6ece80767b81fdb85e12270616c160b4514e075483cdc21499586b9867ee795f5003bd30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flufl.lock \
python311-flufl.lock \
python3dist-flufl.lock"

RDEPENDS:${PN} += "-python311-typing-extensions if python311-base < 3.8 \
python-abi \
python311-atpublic \
python311-psutil"

inherit rpm
