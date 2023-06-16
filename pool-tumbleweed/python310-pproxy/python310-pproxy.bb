SUMMARY = "Proxy server that can tunnel among remote servers by regex rules"
DESCRIPTION = "Proxy server that can tunnel among remote servers by regex rules."
LICENSE = "MIT"

PV = "2.7.8"

RPM_NAME = "python310-pproxy-2.7.8-2.10.noarch.rpm"
RPM_HASH = "5d3df5a40a82af7881834f389953ff4793bcc5cd4b92dacee75a0ec16ca615425d0762d74a1d6df7d7580707dfea08042a2c890faa870cea817f9450fcbb7873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pproxy \
python3.10dist-pproxy \
python310-pproxy \
python3dist-pproxy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
