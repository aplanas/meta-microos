SUMMARY = "Zope Location"
DESCRIPTION = "This package contains documentation files for python-zope.i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python-zope.i18nmessageid-doc-6.0.1-1.3.noarch.rpm"
RPM_HASH = "4663bafb25c9b909938f98e3194558e78d3bb6e43c108d7eb76f8f88821c520549961e4aa8ea3e278243a6bcba642506a24258b1869b4f3e3c92a9eb0ced2f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.i18nmessageid-doc \
python310-zope.i18nmessageid-doc \
python311-zope.i18nmessageid-doc \
python39-zope.i18nmessageid-doc"

RDEPENDS:${PN} += ""

inherit rpm
