SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python39-zope.event-4.6-4.2.noarch.rpm"
RPM_HASH = "1f243ce2359960ee6ea3cd2fe70bd292cbd6495fca6ad2f3737735e2af85b320703170082acbb9593df629588b84a2214fb6aa8d9c30cbf992d327b8314be7a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.event \
python39-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
