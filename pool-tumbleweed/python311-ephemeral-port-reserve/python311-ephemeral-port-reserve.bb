SUMMARY = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it"
DESCRIPTION = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-ephemeral-port-reserve-1.1.4-2.1.noarch.rpm"
RPM_HASH = "95ea8bf5ccee50b87e50cc377a907a2d5432146f17a7b913a10f19fba14db2bdde6f7d9afb82e5b340f0b3e53a6d63d963e9d636035dbdc8d6825b4f0ebdf824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ephemeral-port-reserve \
python311-ephemeral-port-reserve \
python3dist-ephemeral-port-reserve"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
