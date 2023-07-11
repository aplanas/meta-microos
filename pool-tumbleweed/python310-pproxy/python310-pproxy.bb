SUMMARY = "Proxy server that can tunnel among remote servers by regex rules"
DESCRIPTION = "Proxy server that can tunnel among remote servers by regex rules."
LICENSE = "MIT"

PV = "2.7.8"

RPM_NAME = "python310-pproxy-2.7.8-3.1.noarch.rpm"
RPM_HASH = "87ea3ceeec240a95c315a08c0094f84a745c823ab735064b2f450035ee2300ed98077aaf2b8f31e2373a53af3187893ea7ea71195e46abc32e1e4a61086e3f8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pproxy \
python310-pproxy \
python3dist-pproxy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
