SUMMARY = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it"
DESCRIPTION = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-ephemeral-port-reserve-1.1.4-2.3.noarch.rpm"
RPM_HASH = "5a48ab8190277270defffaac58e3600ed11de2386e68b318ec3c83cec9e0b86ff53a36dfaa3cb4bbe8d8b7720e5734db35dd5fea318f0e03416b33f6175ea4f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ephemeral-port-reserve \
python39-ephemeral-port-reserve \
python3dist-ephemeral-port-reserve"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
