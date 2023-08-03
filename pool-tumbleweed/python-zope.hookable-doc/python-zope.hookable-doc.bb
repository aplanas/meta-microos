SUMMARY = "Zope hookable"
DESCRIPTION = "This package contains documentation files for python-zope.hookable."
LICENSE = "ZPL-2.1"

PV = "5.4"

RPM_NAME = "python-zope.hookable-doc-5.4-5.1.noarch.rpm"
RPM_HASH = "0e011fba469ecc7b9f4ba8551dd4c8375be974cc3011ae81828a5d70373f0d2379fe4f421c61ac761e6d30f19134ae08a924bc06438556e8ebca6731e5d23113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.hookable-doc \
python310-zope.hookable-doc \
python311-zope.hookable-doc \
python39-zope.hookable-doc"

RDEPENDS:${PN} += ""

inherit rpm
