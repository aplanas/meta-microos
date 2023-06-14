SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python39-zope.event-4.6-4.1.noarch.rpm"
RPM_HASH = "d37e7c02ae14ed87cd2670653e50e94558a0e4ca7f3d00ae91dd6037cb10cfea1071784200cdf04759af19507dc3e9b0797b1e6525783c3ef31b53c6a766d732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.event \
python39-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
