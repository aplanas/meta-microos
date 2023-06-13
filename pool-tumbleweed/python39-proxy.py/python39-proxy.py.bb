SUMMARY = "TLS interception capable proxy server"
DESCRIPTION = "Fast, Lightweight, Pluggable, TLS interception capable proxy server \
focused on Network monitoring, controls & Application development, testing, debugging. \
 \
Note: On SUSE distributions, the command is installed as proxy-py not as proxy."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python39-proxy.py-2.4.3-1.1.noarch.rpm"
RPM_HASH = "861eadc36270933a77474beac5308f0a6613641a5ef37ad65fe09b6246a3736754283e05ad77b65ae8f6d94c9c368b0d55df5aa365e13babf20b728a4353fdde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(proxy.py) \
python39-proxy.py \
python3dist(proxy.py)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
