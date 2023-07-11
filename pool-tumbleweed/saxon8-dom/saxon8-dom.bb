SUMMARY = "DOM support for saxon8"
DESCRIPTION = "Provides additional classes enabling Saxon to be used with the DOM \
Document Object Model. Supports using a DOM as the input or output of \
transformations and queries, and calling extension functions that use \
DOM interfaces to access a Saxon tree structure. Requires DOM level 3 \
(dom.jar, part of JAXP 1.3) to be on the classpath, if not running \
under JDK 1.5."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-dom-B.8.8-133.7.noarch.rpm"
RPM_HASH = "adcc38194e75c70092cff1866cab4b7a6a64ef94e7fd5f1a3170370179d715987a4d62a98d1fca876c5b2de22cd069a317352451f45d147a0c8456b9a8c0cddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-dom"

RDEPENDS:${PN} += "saxon8"

inherit rpm
