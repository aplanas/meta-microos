SUMMARY = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it"
DESCRIPTION = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-ephemeral-port-reserve-1.1.4-2.3.noarch.rpm"
RPM_HASH = "7c77b5c8111e2563764dd0d410d36f516819c16bfd3c09cc842ed6b0391b73cc8d23f48cff2dc1c1ab8d692bff1feb4ec079283b60bacb9e8e7660c202ea0a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ephemeral-port-reserve \
python310-ephemeral-port-reserve \
python3dist-ephemeral-port-reserve"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
