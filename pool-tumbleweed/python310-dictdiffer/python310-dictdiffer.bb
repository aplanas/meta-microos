SUMMARY = "Dictdiffer is a library that helps you to diff and patch dictionaries"
DESCRIPTION = "Dictdiffer is a library that helps you to diff and patch dictionaries."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-dictdiffer-0.9.0-2.8.noarch.rpm"
RPM_HASH = "4021997ca44a9b7dffe1f49b213e8e0b6e428cbc59258137e4b6850873b5959448c3ec9276176ce299a6e753dd2a595fd773993c2ad1b71af3d271921a518194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dictdiffer \
python310-dictdiffer \
python3dist-dictdiffer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
