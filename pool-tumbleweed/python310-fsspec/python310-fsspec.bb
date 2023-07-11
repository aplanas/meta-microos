SUMMARY = "Filesystem specification package"
DESCRIPTION = "A specification for pythonic filesystems."
LICENSE = "BSD-3-Clause"

PV = "2023.6.0"

RPM_NAME = "python310-fsspec-2023.6.0-1.1.noarch.rpm"
RPM_HASH = "6d3f3da5d9b12df56f356f25cc5c2a068cf3c46a101d79868b7e618ef391d65ff4da3b5f5b9dfc69fc668f3241131d22c478b1705cfeee0dc1b607c47b788140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fsspec \
python310-fsspec \
python3dist-fsspec"

RDEPENDS:${PN} += "fuse \
python-abi"

inherit rpm
