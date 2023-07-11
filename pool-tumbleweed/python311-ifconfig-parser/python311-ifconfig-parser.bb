SUMMARY = "Python package for parsing raw output of ifconfig"
DESCRIPTION = "Python package for parsing raw output of ifconfig."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python311-ifconfig-parser-0.0.5-1.15.noarch.rpm"
RPM_HASH = "a014a0082d4b59da690d8e4bac0b421550379f5ee9b28803727c4ae09cba07131f391b4953491cb3981baa898fad4da8115da954e8710c68127be7f67975c0c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ifconfig-parser \
python3.11dist-ifconfig-parser \
python311-ifconfig-parser \
python3dist-ifconfig-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
