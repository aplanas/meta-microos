SUMMARY = "Filesystem specification package"
DESCRIPTION = "A specification for pythonic filesystems."
LICENSE = "BSD-3-Clause"

PV = "2023.6.0"

RPM_NAME = "python311-fsspec-2023.6.0-1.1.noarch.rpm"
RPM_HASH = "a29261833f36d1950a601c25fc3a2e9b96be6cadf1b2dbf9e85655102887346252887aa7287cabace9764c725eb9a0f391771580d60153bf4735e765acd13821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fsspec \
python3.11dist-fsspec \
python311-fsspec \
python3dist-fsspec"

RDEPENDS:${PN} += "fuse \
python-abi"

inherit rpm
