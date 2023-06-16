SUMMARY = "TLS interception capable proxy server"
DESCRIPTION = "Fast, Lightweight, Pluggable, TLS interception capable proxy server \
focused on Network monitoring, controls & Application development, testing, debugging. \
 \
Note: On SUSE distributions, the command is installed as proxy-py not as proxy."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python311-proxy.py-2.4.3-1.1.noarch.rpm"
RPM_HASH = "c7dca354f3b024adabbcfcbe9ca20b1a472c411e07e88421b525cf048db57bbc2d3d94329ccab096705396d99fdb8b0c45a053d3d0f9a9cc1a2fb6c6a05581df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-proxy.py \
python311-proxy.py \
python3dist-proxy.py"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
