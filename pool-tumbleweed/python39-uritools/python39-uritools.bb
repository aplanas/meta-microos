SUMMARY = "URI parsing, classification and composition"
DESCRIPTION = "URI parsing, classification and composition."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-uritools-4.0.0-1.4.noarch.rpm"
RPM_HASH = "02f0b999eb2546212286473c6c87853312d54616da11b6ca2f2319b91ea0e4255dd98f210de26f6b8b3f293930e7dd7ecfffbf0e50ee0910695f4248d4890926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uritools \
python39-uritools \
python3dist-uritools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
