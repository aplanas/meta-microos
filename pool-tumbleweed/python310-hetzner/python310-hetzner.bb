SUMMARY = "High level access to the Hetzner robot"
DESCRIPTION = "A high-level Python API for accessing the Hetzner robot."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "python310-hetzner-0.8.3-1.10.noarch.rpm"
RPM_HASH = "ec3c330d5b58c87dfc6b6e15ef1c7b98429b3d504d678a154e6998b9d7a304e5252b2f420ed8d3eac8234f5370b4f3b23156078d3eb60331b14771e2fab1f0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hetzner \
python310-hetzner \
python3dist-hetzner"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
