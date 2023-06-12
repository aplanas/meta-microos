SUMMARY = "NFS-safe file locking with timeouts for POSIX and Windows"
DESCRIPTION = "NFS-safe file locking with timeouts for POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "7.1.1"

RPM_NAME = "python310-flufl.lock-7.1.1-2.4.noarch.rpm"
RPM_HASH = "57ec253d551e655cbd2f672ddf5a19e96c1dd2ad099da02abefc424a958e092fc4c559b0fe39dfa8a5d6311e4382909b34115bc30593f73209c0d3950167dd12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.lock \
python3.10dist(flufl.lock) \
python310-flufl.lock \
python3dist(flufl.lock)"
RDEPENDS:${PN} += "(python310-typing_extensions if python310-base < 3.8) \
python(abi) \
python310-atpublic \
python310-psutil"

inherit rpm
