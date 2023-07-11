SUMMARY = "AngularJS library 'term.js' repackaged for the XStatic standard"
DESCRIPTION = "term.js javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
* term.js project: `Github chjj/term.js <https://github.com/chjj/term.js>`_ \
* XStatic package: `Github takluyver/XStatic-termjs <https://github.com/takluyver/XStatic-termjs>`_ \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.0.7.0"

RPM_NAME = "python39-XStatic-term.js-0.0.7.0-1.16.aarch64.rpm"
RPM_HASH = "669813e3a945d4000174e5dc7cc55536049c461d643dbaa048172bd64e5511f21d109503cf90da2ce05d10c9ab4b5379e4c6b81fafde40a05a2ff896be8567fe"

RPROVIDES:${PN} += "python3.9dist-xstatic-term.js \
python39-XStatic-term.js \
python3dist-xstatic-term.js"

RDEPENDS:${PN} += "python-abi"

inherit rpm
