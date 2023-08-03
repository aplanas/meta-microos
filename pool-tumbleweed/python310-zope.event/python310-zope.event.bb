SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python310-zope.event-4.6-5.1.noarch.rpm"
RPM_HASH = "b17951e27a8a84abae761164d469c0626ab9070805f204aff24e7a72d85a8973339fcbcaa850fbc6c100d1407fb3332d421a58784c0a87aa537fff494bca9761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.event \
python310-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
