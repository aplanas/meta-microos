SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python39-zope.event-4.6-5.1.noarch.rpm"
RPM_HASH = "b426a30c5d40e619582cf3f0db70e9c1540ac6cac6094b51946fa01d6ba739443d8ae41eadf3a1e087bf4aba2d5fb2ee4fae61a72a72f7a7e604bf33997873ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.event \
python39-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
