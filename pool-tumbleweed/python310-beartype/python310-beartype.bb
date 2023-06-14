SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-beartype-0.14.0-1.1.noarch.rpm"
RPM_HASH = "322a7dde54d53a9f27118c1a53b612007788d19e9be81460b35440abd9f47b4b363a8d0e7318ca496e03d3663994c857281b56bae492d7b6a69b4a9a91020f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-beartype \
python3.10dist-beartype \
python310-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm
