SUMMARY = "ipdb/pdb statement checker plugin for flake8"
DESCRIPTION = "ipdb/pdb statement checker plugin for flake8"
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python310-flake8-debugger-4.1.2-1.5.noarch.rpm"
RPM_HASH = "1da01d7444c03068b5cd7f21df29d429e169feef3bc62bdf7d28903a2d01194b78815a0e94f7c8ae80acdca8f1d2398ac763bc07c342433d5fcdcc4e139d8fbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-debugger \
python310-flake8-debugger \
python3dist-flake8-debugger"

RDEPENDS:${PN} += "python-abi"

inherit rpm
