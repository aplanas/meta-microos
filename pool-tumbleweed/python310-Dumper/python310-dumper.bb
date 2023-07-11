SUMMARY = "Tool to conveniently describe any Python datastructure"
DESCRIPTION = "Tool to conveniently describe any Python datastructure"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-Dumper-1.2.0-2.7.noarch.rpm"
RPM_HASH = "6f344bfdeb3bf0de0356541f36cc9a4d71109db8765a683db4b983076319a34e15a6f64258feda17310e0c9ad0300ba1efab3c41059cf34ee9c041264a056fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dumper \
python310-Dumper \
python3dist-dumper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
