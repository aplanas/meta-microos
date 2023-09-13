SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-zope.event-5.0-1.1.noarch.rpm"
RPM_HASH = "de36657b4f75b3516cc2ace39101b1ab73ddc90b2cd2d3e5697a20708d9220b97cebef35a774559fcadc842cac2707db622cc344ffd424cebf1589325c1bf660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.event \
python39-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
