SUMMARY = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it"
DESCRIPTION = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-ephemeral-port-reserve-1.1.4-2.3.noarch.rpm"
RPM_HASH = "cfd92f2a1e5dfc801faa09bc01967029db1f041592f43f071203817b5231ba799a2e1feed934617ad9c48362903015d491aaa12ec91767bbb3e4a40409c74a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ephemeral-port-reserve \
python3.11dist-ephemeral-port-reserve \
python311-ephemeral-port-reserve \
python3dist-ephemeral-port-reserve"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
