SUMMARY = "NFS-safe file locking with timeouts for POSIX and Windows"
DESCRIPTION = "NFS-safe file locking with timeouts for POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "7.1.1"

RPM_NAME = "python310-flufl.lock-7.1.1-3.1.noarch.rpm"
RPM_HASH = "a8781a8b4aee2a8457281a2241692463896444f53d37efb52aceb060dab7d5fd68f5437fdb49a01f82189f6686894705613ed1872e5e97bd2c551591a8cf872f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flufl.lock \
python310-flufl.lock \
python3dist-flufl.lock"

RDEPENDS:${PN} += "python-abi \
python310-atpublic \
python310-psutil"

inherit rpm
