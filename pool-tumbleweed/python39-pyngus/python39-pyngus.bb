SUMMARY = "Callback API implemented over Proton"
DESCRIPTION = "A messaging framework built on the QPID Proton engine. It \
provides a callback-based API for message passing"
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "python39-pyngus-2.3.1-1.11.noarch.rpm"
RPM_HASH = "96c1f8737af3e8e3151098d1f396a4b161a2a8e8724f996d0682ee980f048e7f1b62f0442731733afb883584f967c5c3e7d0376b5b203514ae101dc53f493baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyngus \
python39-pyngus \
python3dist-pyngus"

RDEPENDS:${PN} += "python-abi \
python39-python-qpid-proton"

inherit rpm
