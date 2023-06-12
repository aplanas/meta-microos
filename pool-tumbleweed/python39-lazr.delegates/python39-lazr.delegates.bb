SUMMARY = "Easily write objects that delegate behavior"
DESCRIPTION = "Easily write objects that delegate behavior"
LICENSE = "LGPL-3.0-only"

PV = "2.0.4"

RPM_NAME = "python39-lazr.delegates-2.0.4-1.13.noarch.rpm"
RPM_HASH = "9bd80210482455f1248161bdc30a02e6c25ba800c2a78e038c7ba013a050aa0ff33e6b02117777521684a1aeb8ea8adb53002946708a71f24d8a840253ac1491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lazr.delegates) \
python39-lazr.delegates \
python3dist(lazr.delegates)"
RDEPENDS:${PN} += "python(abi) \
python39-zope.interface"

inherit rpm
