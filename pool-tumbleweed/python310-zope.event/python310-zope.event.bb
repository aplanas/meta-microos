SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-zope.event-5.0-1.1.noarch.rpm"
RPM_HASH = "edb52fe148db1abf0d7659cb9b86346698926d65c0f906c4b30b5a0db55375692a64416d95c232de71dca0eaf80c09a9e3d286769d4eaaedd6f95a873f6e3ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.event \
python310-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
