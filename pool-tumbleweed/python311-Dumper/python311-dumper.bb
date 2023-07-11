SUMMARY = "Tool to conveniently describe any Python datastructure"
DESCRIPTION = "Tool to conveniently describe any Python datastructure"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-Dumper-1.2.0-2.7.noarch.rpm"
RPM_HASH = "ac5ab24d79e4dbdc172d04af7f42599aadfc8cd2f318a3528f80684b74eaa91de0e210956980da11dba70c51f0e58da29621340dca9b32f54e218022e2922bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Dumper \
python3.11dist-dumper \
python311-Dumper \
python3dist-dumper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
