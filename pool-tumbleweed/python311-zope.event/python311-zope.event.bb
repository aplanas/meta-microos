SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python311-zope.event-4.6-4.2.noarch.rpm"
RPM_HASH = "f0cb42e624f27c6e4bae660c806f881a51a0b5062dfed95f7421e038d8bcf940b6550115454b675d319ddf7b10cfdf61664d54eccb70f6a468fb21d077f0b6dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.event \
python3.11dist-zope.event \
python311-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
