SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python310-zope.event-4.6-4.2.noarch.rpm"
RPM_HASH = "84885dbfca1bb48cb63f81124307fb43c48e53eca87616d619c2100431bd09a644032a6bbe249286bc87b22abd83f04b27a735476a4b3733623d6bed35ef81e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.event \
python310-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
