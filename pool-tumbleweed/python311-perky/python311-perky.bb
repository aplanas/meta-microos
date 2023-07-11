SUMMARY = "A parser for the perky text file format"
DESCRIPTION = "An 'rcfile' text file format for Python programs solving the same \
problem as 'INI' files, 'TOML' files, and 'JSON' files."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python311-perky-0.5.5-1.5.noarch.rpm"
RPM_HASH = "783778b6b581defb9cce3b6491bc359222f79fb9ff0683f048f56e15e4b096b7a036e07fe4683547d810e703aebb2a9cd788106da70928b6ae26b0eb75bc15d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-perky \
python3.11dist-perky \
python311-perky \
python3dist-perky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
