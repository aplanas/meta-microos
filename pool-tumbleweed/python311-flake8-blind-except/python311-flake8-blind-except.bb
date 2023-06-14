SUMMARY = "A flake8 extension that checks for blind except: statements"
DESCRIPTION = "A flake8 extension that checks for blind except: statements"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-flake8-blind-except-0.2.1-1.3.noarch.rpm"
RPM_HASH = "590320ff93250b91ac225a0973247882a0a72fdae7f3f0b6c7822d65fa8a1415d2e29a146e447e6ce000eb17862fb855434ab4b57d74f8df5ee378c83452f620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flake8-blind-except \
python311-flake8-blind-except \
python3dist-flake8-blind-except"

RDEPENDS:${PN} += "python-abi"

inherit rpm
