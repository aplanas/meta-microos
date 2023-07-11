SUMMARY = "NFS-safe file locking with timeouts for POSIX and Windows"
DESCRIPTION = "NFS-safe file locking with timeouts for POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "7.1.1"

RPM_NAME = "python311-flufl.lock-7.1.1-3.1.noarch.rpm"
RPM_HASH = "5cc80042c0d6d57e4101c77b200a74e70aee8e9f70604c3291ca31596724487de97d2d5cf6575b8c34c7e31cd28d14246d355f7967ca61217a232ccf4e2d90e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.lock \
python3.11dist-flufl.lock \
python311-flufl.lock \
python3dist-flufl.lock"

RDEPENDS:${PN} += "python-abi \
python311-atpublic \
python311-psutil"

inherit rpm
