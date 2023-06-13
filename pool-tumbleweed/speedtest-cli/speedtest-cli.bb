SUMMARY = "Command line interface for testing internet bandwidth"
DESCRIPTION = "Command line interface for testing internet bandwidth using \
speedtest.net"
LICENSE = "Apache-2.0"

PV = "2.1.3"

RPM_NAME = "speedtest-cli-2.1.3-1.7.noarch.rpm"
RPM_HASH = "249181391172aa986e8c3c717f3607d8db8a3577c39b30021c4cb74b1953a40be9a04d9afddf3049b5da74adc524a1ed4e42d1ba39c0c33aaa265f70e5b4fe69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(speedtest-cli) \
python3dist(speedtest-cli) \
speedtest-cli"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-setuptools"

inherit rpm
