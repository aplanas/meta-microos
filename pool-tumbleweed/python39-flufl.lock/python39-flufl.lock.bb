SUMMARY = "NFS-safe file locking with timeouts for POSIX and Windows"
DESCRIPTION = "NFS-safe file locking with timeouts for POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "7.1.1"

RPM_NAME = "python39-flufl.lock-7.1.1-2.4.noarch.rpm"
RPM_HASH = "d25d73defc68b3d1bb0c06974657aa55547683ada12eb902a693f3eada24c0c6aebf7cd90cfebebc9e7724ed474f40c21777de30574568a163f1bfab489c5535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flufl.lock) \
python39-flufl.lock \
python3dist(flufl.lock)"

RDEPENDS:${PN} += "(python39-typing_extensions if python39-base < 3.8) \
python(abi) \
python39-atpublic \
python39-psutil"

inherit rpm
