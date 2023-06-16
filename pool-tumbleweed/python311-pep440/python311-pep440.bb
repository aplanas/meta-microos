SUMMARY = "Check whether versions number match PEP 440"
DESCRIPTION = "A simple package with utils to check whether versions number match Pep 440."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-pep440-0.1.2-1.4.noarch.rpm"
RPM_HASH = "db8a0db59ff5cf84a5b77e399e6b70832f531eb127a5f69447584b11351bed257342dda628dd934abd04128bb437b4e80854f1797be29e5c300f3a95eb1f510a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pep440 \
python311-pep440 \
python3dist-pep440"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
