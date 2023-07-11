SUMMARY = "Pyramid Chameleon integration"
DESCRIPTION = "These are bindings for the `Chameleon templating system \
<http://pagetemplates.org/>`_ for the Pyramid_ web framework."
LICENSE = "BSD-3-Clause & ZPL-2.1 & MIT"

PV = "0.3"

RPM_NAME = "python311-pyramid-chameleon-0.3-5.10.noarch.rpm"
RPM_HASH = "d6b306c40a090ac7af391f4c9af84ca69dcfd797de59b4173399d8572446165a292f8f3b390c1b55be6a99637d8873d83f66147048fe0922284c733f0d2bccfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid-chameleon \
python3.11dist-pyramid-chameleon \
python311-pyramid-chameleon \
python3dist-pyramid-chameleon"

RDEPENDS:${PN} += "python-abi \
python311-Chameleon \
python311-pyramid"

inherit rpm
