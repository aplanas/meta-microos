SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python311-zope.event-4.6-4.1.noarch.rpm"
RPM_HASH = "e56e39a26c5d43fbfc4533e19a0adff00c118f32f894cf828591df6916557eef59c0b3d0606a3925dc1dfeb605f08687e01e5e9fe124c058b81ef6501ef74f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.event) \
python311-zope.event \
python3dist(zope.event)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
