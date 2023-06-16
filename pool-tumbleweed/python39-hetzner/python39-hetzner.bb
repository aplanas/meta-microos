SUMMARY = "High level access to the Hetzner robot"
DESCRIPTION = "A high-level Python API for accessing the Hetzner robot."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "python39-hetzner-0.8.3-1.9.noarch.rpm"
RPM_HASH = "b2ca249db9ac484c9741f7ed5fc57d2667bb98bb49893be839350ba1afb7ce8b75a91c6c1d8c1d0c61723df308af019231ad6a2482a34e73b3873a49ea040b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hetzner \
python39-hetzner \
python3dist-hetzner"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
