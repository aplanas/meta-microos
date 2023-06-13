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

RPM_NAME = "python310-XStatic-term.js-0.0.7.0-1.15.aarch64.rpm"
RPM_HASH = "33f3c1715a9cb87ebbcb73394705fbfe498fec1ab91a7f8b262f2a626a6767f1277429abcf97bdf061d4bd6159f6f483b4c73d082c035b702f0dd34f4122fc27"

RPROVIDES:${PN} += "python3-XStatic-term.js \
python3.10dist(xstatic-term.js) \
python310-XStatic-term.js \
python310-XStatic-term.js(aarch-64) \
python3dist(xstatic-term.js)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
