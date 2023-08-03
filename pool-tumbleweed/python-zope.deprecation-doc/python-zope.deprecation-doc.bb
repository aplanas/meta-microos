SUMMARY = "Zope 3 Deprecation Infrastructure"
DESCRIPTION = "This package contains documentation files for python-zope.deprecation."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python-zope.deprecation-doc-5.0-3.1.noarch.rpm"
RPM_HASH = "0c399c339340f15bcd794e0ba6ef6d087acd20d135a30758337afae80beb1a7d0a292dd2787279893ffdd24f11dd613139d6684b6f88fa28c2d8fa6e73b78a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.deprecation-doc \
python310-zope.deprecation-doc \
python311-zope.deprecation-doc \
python39-zope.deprecation-doc"

RDEPENDS:${PN} += ""

inherit rpm
