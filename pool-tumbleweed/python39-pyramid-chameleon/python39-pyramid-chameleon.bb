SUMMARY = "Pyramid Chameleon integration"
DESCRIPTION = "These are bindings for the `Chameleon templating system \
<http://pagetemplates.org/>`_ for the Pyramid_ web framework."
LICENSE = "BSD-3-Clause & ZPL-2.1 & MIT"

PV = "0.3"

RPM_NAME = "python39-pyramid-chameleon-0.3-5.8.noarch.rpm"
RPM_HASH = "b3bdbb3b8ff1738cad93c1c46adf220de0156459bd7e5cdd6d2c7569c4efdcae6970822019acc55e2a26c7351aa1c504e077d5490f44dfd655c02c8607b868b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyramid-chameleon) \
python39-pyramid-chameleon \
python3dist(pyramid-chameleon)"

RDEPENDS:${PN} += "python(abi) \
python39-Chameleon \
python39-pyramid"

inherit rpm
