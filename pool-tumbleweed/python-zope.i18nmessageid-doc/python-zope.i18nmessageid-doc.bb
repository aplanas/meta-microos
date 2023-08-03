SUMMARY = "Zope Location"
DESCRIPTION = "This package contains documentation files for python-zope.i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python-zope.i18nmessageid-doc-6.0.1-2.1.noarch.rpm"
RPM_HASH = "b9b17fbdb98a9ca0f00f6ed4be79e3b444eaeb8f6fcc5a70688734962ce183293c2375c648dbba35e52152d9ebde7b5031e70be8892386414ad23da87fc5e4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.i18nmessageid-doc \
python310-zope.i18nmessageid-doc \
python311-zope.i18nmessageid-doc \
python39-zope.i18nmessageid-doc"

RDEPENDS:${PN} += ""

inherit rpm
