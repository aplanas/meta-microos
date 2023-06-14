SUMMARY = "Python library for accessing a Linux VDR via SVDRP"
DESCRIPTION = "Python library for accessing a Linux VDR via SVDRP."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python39-pyvdr-0.3.1-1.8.noarch.rpm"
RPM_HASH = "9e6922d768673271f00fc9fc7a171ae3da498be458d29a0f675b6115fea45f78c3ae347f88882ebcd235a690380559b34689cad65785cf8537b08a88fce53726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyvdr \
python39-pyvdr \
python3dist-pyvdr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
