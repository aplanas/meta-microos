SUMMARY = "Library that versions your Python projects"
DESCRIPTION = "Incremental is a small library that versions your Python projects."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-incremental-22.10.0-2.1.noarch.rpm"
RPM_HASH = "0e94a05c6f642b68556f1762c6950e97cfb55d8139703033f33a4476911a022dbb72a54cfb452fcd89d2d2c881f361fcb40a668e650e6bafae70bb49a8262817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-incremental \
python39-incremental \
python3dist-incremental"

RDEPENDS:${PN} += "python-abi"

inherit rpm
