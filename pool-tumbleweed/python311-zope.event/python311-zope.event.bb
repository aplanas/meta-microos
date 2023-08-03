SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python311-zope.event-4.6-5.1.noarch.rpm"
RPM_HASH = "a8fd2d0b2ec70aae52a43cbeed5097fece09e03183ab0af59007dc034021cdc65f63e810a912c94466396f2cae45c997e4a08d1039aee5b7e297c573d5d48dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.event \
python3.11dist-zope.event \
python311-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
