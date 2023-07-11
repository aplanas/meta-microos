SUMMARY = "A PyPI client"
DESCRIPTION = "A PyPI client."
LICENSE = "MIT"

PV = "0.1.9"

RPM_NAME = "python39-yarg-0.1.9-3.3.noarch.rpm"
RPM_HASH = "7b958e53c2b4e5728931de73b35f647ada69aee6d5bdf2702c6feee796e348d84019ca07631a7c7884265b9a8a6e58bfe32f66e8d20143a296b51f6c9d89013b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yarg \
python39-yarg \
python3dist-yarg"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
