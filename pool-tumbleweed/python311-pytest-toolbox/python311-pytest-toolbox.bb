SUMMARY = "Numerous plugins for pytest"
DESCRIPTION = "Numerous useful plugins for pytest."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-pytest-toolbox-0.4-4.1.noarch.rpm"
RPM_HASH = "acf27561fc5b9c4035192697e9881c64533552229af4f5895b6d8d67a1bc2c2bef1aeb29dddae302265e6fdaee511407742c58538b2cf14224a773fe5ddf3af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-toolbox \
python3.11dist-pytest-toolbox \
python311-pytest-toolbox \
python3dist-pytest-toolbox"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest"

inherit rpm
