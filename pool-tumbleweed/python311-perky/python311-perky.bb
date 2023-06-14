SUMMARY = "A parser for the perky text file format"
DESCRIPTION = "An 'rcfile' text file format for Python programs solving the same \
problem as 'INI' files, 'TOML' files, and 'JSON' files."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python311-perky-0.5.5-1.4.noarch.rpm"
RPM_HASH = "a0f2afdb8efb799edde03583c861f21082389606cb57a88b3574dab3e8c806e90d42a4eb9b67501232116150bb1aa3dab8360e07703f93e8db35535c76d9898a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-perky \
python311-perky \
python3dist-perky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
