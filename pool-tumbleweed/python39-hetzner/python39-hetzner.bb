SUMMARY = "High level access to the Hetzner robot"
DESCRIPTION = "A high-level Python API for accessing the Hetzner robot."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "python39-hetzner-0.8.3-1.10.noarch.rpm"
RPM_HASH = "96621fa7b6334198d579c08b5a9e82f2b454074e34758f425ff29e379970920079cde73bc9078a69e59b23112c1948929a74a670fc6344591dbd0899cb5e1292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hetzner \
python39-hetzner \
python3dist-hetzner"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
