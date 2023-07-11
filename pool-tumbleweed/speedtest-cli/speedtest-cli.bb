SUMMARY = "Command line interface for testing internet bandwidth"
DESCRIPTION = "Command line interface for testing internet bandwidth using \
speedtest.net"
LICENSE = "Apache-2.0"

PV = "2.1.3"

RPM_NAME = "speedtest-cli-2.1.3-1.8.noarch.rpm"
RPM_HASH = "914746d97d350dc6c554e0c5fa58e51a6abf886a71616fa260eaf3b516e94e7936f039e8ba6c665561fcba9b00caee3692a5f20940a8d098958632e0c6f2cfc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-speedtest-cli \
python3dist-speedtest-cli \
speedtest-cli"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-setuptools"

inherit rpm
