SUMMARY = "ipdb/pdb statement checker plugin for flake8"
DESCRIPTION = "ipdb/pdb statement checker plugin for flake8"
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python311-flake8-debugger-4.1.2-1.5.noarch.rpm"
RPM_HASH = "512e96c45c5fc2347416c79125bd7ab2de036d09e19f928f8896770ab3985d0aa020904e040725315a2e80189e335f921495da75813ae7a09d0f51620f4f9013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-debugger \
python3.11dist-flake8-debugger \
python311-flake8-debugger \
python3dist-flake8-debugger"

RDEPENDS:${PN} += "python-abi"

inherit rpm
