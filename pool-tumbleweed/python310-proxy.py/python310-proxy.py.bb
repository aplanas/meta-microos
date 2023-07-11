SUMMARY = "TLS interception capable proxy server"
DESCRIPTION = "Fast, Lightweight, Pluggable, TLS interception capable proxy server \
focused on Network monitoring, controls & Application development, testing, debugging. \
 \
Note: On SUSE distributions, the command is installed as proxy-py not as proxy."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python310-proxy.py-2.4.3-1.4.noarch.rpm"
RPM_HASH = "538bd37dc44f174e04f4fefef60e5092304a1d8b8430fa9f30330ac566f014a3dad3585fd96ba1b179a9311850b4f4bdeb9969ce1aba4a6ca9cd5230f6109b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-proxy.py \
python310-proxy.py \
python3dist-proxy.py"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
