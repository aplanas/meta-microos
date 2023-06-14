SUMMARY = "Filesystem specification package"
DESCRIPTION = "A specification for pythonic filesystems."
LICENSE = "BSD-3-Clause"

PV = "2023.3.0"

RPM_NAME = "python311-fsspec-2023.3.0-2.2.noarch.rpm"
RPM_HASH = "945639c9323811e1e285a13b5507d8cd4ccb576373584e22cecaf3a2ca1167c0e0d09111b9286ec6dd859f6ca26e9765ecc551747e9b133fad000e52016d389b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fsspec \
python311-fsspec \
python3dist-fsspec"

RDEPENDS:${PN} += "fuse \
python-abi"

inherit rpm
