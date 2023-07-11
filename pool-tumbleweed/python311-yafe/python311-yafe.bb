SUMMARY = "Yet Another Framework for Experiments"
DESCRIPTION = "The package yafe offers a generic framework to conduct \
scientific experiments."
LICENSE = "GPL-3.0-only"

PV = "1.0.3"

RPM_NAME = "python311-yafe-1.0.3-2.10.noarch.rpm"
RPM_HASH = "6a4854ad39ab1d5d4f53f3e1cf6e917081c6d489c13b83d4cdb050eea214bca133e1e9060b897ffdc0c3f4821f35105efecf97e79c95983cf86adabf9dfff56e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yafe \
python3.11dist-yafe \
python311-yafe \
python3dist-yafe"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm
