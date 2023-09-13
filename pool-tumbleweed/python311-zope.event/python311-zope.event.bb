SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-zope.event-5.0-1.1.noarch.rpm"
RPM_HASH = "24fa66720276157b864f00092515516d9a68a3ef5925fcf4095cd47f39c5459d6be6597645631de020559c993475637c55a6edc41ce0e302a28ae3ac2d113ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.event \
python3.11dist-zope.event \
python311-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
