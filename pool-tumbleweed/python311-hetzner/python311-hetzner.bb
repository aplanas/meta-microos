SUMMARY = "High level access to the Hetzner robot"
DESCRIPTION = "A high-level Python API for accessing the Hetzner robot."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "python311-hetzner-0.8.3-1.9.noarch.rpm"
RPM_HASH = "1a24a97abc5732039e73c9dde4d173d7c5e897102ce19437b647a6f552f81094efdc34e734f283bf362ed2afd95a9113c25262bf308fc884d9a1d86d3053a8ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hetzner) \
python311-hetzner \
python3dist(hetzner)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
