SUMMARY = "Zope hookable"
DESCRIPTION = "This package contains documentation files for python-zope.hookable."
LICENSE = "ZPL-2.1"

PV = "5.4"

RPM_NAME = "python-zope.hookable-doc-5.4-4.3.noarch.rpm"
RPM_HASH = "ff3b2227cb2d3471cbb8cbd74a6a2b3febbe626a9216dbb1d42bbf55aa5e8c3a1378badbe1bbb1c28e1f9077d18ce883a2da01c4fca68c3e4351cb601ea5586b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.hookable-doc \
python310-zope.hookable-doc \
python311-zope.hookable-doc \
python39-zope.hookable-doc"

RDEPENDS:${PN} += ""

inherit rpm
