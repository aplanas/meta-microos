SUMMARY = "Pyramid Chameleon integration"
DESCRIPTION = "These are bindings for the `Chameleon templating system \
<http://pagetemplates.org/>`_ for the Pyramid_ web framework."
LICENSE = "BSD-3-Clause & ZPL-2.1 & MIT"

PV = "0.3"

RPM_NAME = "python311-pyramid-chameleon-0.3-5.8.noarch.rpm"
RPM_HASH = "d5ce37532c26eaa8a85aa96f36d20d587dcd35cfed19f252eeec6165badac55c3223e62ab1726363c1932523afa8eab5e18d97848ed1265132030190f2cbb55e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyramid-chameleon \
python311-pyramid-chameleon \
python3dist-pyramid-chameleon"

RDEPENDS:${PN} += "python-abi \
python311-Chameleon \
python311-pyramid"

inherit rpm
