SUMMARY = "TLS interception capable proxy server"
DESCRIPTION = "Fast, Lightweight, Pluggable, TLS interception capable proxy server \
focused on Network monitoring, controls & Application development, testing, debugging. \
 \
Note: On SUSE distributions, the command is installed as proxy-py not as proxy."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python310-proxy.py-2.4.3-1.1.noarch.rpm"
RPM_HASH = "c108a40e8fbe59a70dccde231cbb79cfef05e66c97f16468385d1314fef193c332d17463c7806882569803b784d17838314697f00137547d89f291c6ebad3e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proxy.py \
python3.10dist(proxy.py) \
python310-proxy.py \
python3dist(proxy.py)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
