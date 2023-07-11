SUMMARY = "Python package to work with Document Object Identifier (doi)"
DESCRIPTION = "Python package to work with Document Object Identifier (doi)"
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python39-python-doi-0.2.0-1.5.noarch.rpm"
RPM_HASH = "f945815ea061b2bd76c67ad492473c57886e1f27acf65b0871241b3b842d1807471d150593d168df871de0bb884a5524bbbaa9e22b28c8565c74dfb6a62ca2ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-doi \
python39-python-doi \
python3dist-python-doi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
