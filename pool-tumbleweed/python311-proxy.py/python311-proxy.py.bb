SUMMARY = "TLS interception capable proxy server"
DESCRIPTION = "Fast, Lightweight, Pluggable, TLS interception capable proxy server \
focused on Network monitoring, controls & Application development, testing, debugging. \
 \
Note: On SUSE distributions, the command is installed as proxy-py not as proxy."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python311-proxy.py-2.4.3-1.4.noarch.rpm"
RPM_HASH = "745fbf84e206d6e74974d629198b02396bcbc423a19b472441eb27b0bfbc74c17d18bfeb2fd292d414827d2b30a29e0da5c2c57a66658ad00f7ffec88afa5832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proxy.py \
python3.11dist-proxy.py \
python311-proxy.py \
python3dist-proxy.py"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
