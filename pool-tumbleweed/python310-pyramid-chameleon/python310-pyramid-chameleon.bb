SUMMARY = "Pyramid Chameleon integration"
DESCRIPTION = "These are bindings for the `Chameleon templating system \
<http://pagetemplates.org/>`_ for the Pyramid_ web framework."
LICENSE = "BSD-3-Clause & ZPL-2.1 & MIT"

PV = "0.3"

RPM_NAME = "python310-pyramid-chameleon-0.3-5.8.noarch.rpm"
RPM_HASH = "99dac4f5efebd906f6d2b444b9ea7435f0b2aa76def47e94f77e15e283cadeaa7ed8b8e2d9fbc0e5950cdb31218ea33972ff32aa01b7d99ca142139d3a80c6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid-chameleon \
python3.10dist-pyramid-chameleon \
python310-pyramid-chameleon \
python3dist-pyramid-chameleon"

RDEPENDS:${PN} += "python-abi \
python310-Chameleon \
python310-pyramid"

inherit rpm
