SUMMARY = "Library with helpers for the jsonlines file format"
DESCRIPTION = "Python library to simplify working with jsonlines_ and ndjson_ data."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python311-jsonlines-3.1.0-2.1.noarch.rpm"
RPM_HASH = "6f1c521f4aab5cc5093eb10862321a60fc792d74cc5295a2f7c78e78f14bc0ebc89ef2cdd5995e1b7a63a36ce139a520b54a1a50b9bd3d6d2badfdd11cf19a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonlines \
python3.11dist-jsonlines \
python311-jsonlines \
python3dist-jsonlines"

RDEPENDS:${PN} += "python-abi"

inherit rpm
