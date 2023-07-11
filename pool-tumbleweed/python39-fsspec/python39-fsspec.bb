SUMMARY = "Filesystem specification package"
DESCRIPTION = "A specification for pythonic filesystems."
LICENSE = "BSD-3-Clause"

PV = "2023.6.0"

RPM_NAME = "python39-fsspec-2023.6.0-1.1.noarch.rpm"
RPM_HASH = "c0b31ddddda368959388c03b980b33e44b2a8f20de9b452e1bd0b07700b73abd38280cc9a0a3b4b3cfc6ccdba420ed283822af13fe6f97313490833c7a4d9c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fsspec \
python39-fsspec \
python3dist-fsspec"

RDEPENDS:${PN} += "fuse \
python-abi"

inherit rpm
