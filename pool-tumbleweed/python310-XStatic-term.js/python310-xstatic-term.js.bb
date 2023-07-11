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

RPM_NAME = "python310-XStatic-term.js-0.0.7.0-1.16.aarch64.rpm"
RPM_HASH = "5bf4f8bb41dbd5fa20c5e3173c4fc0069403997e05e44bcd054b4db1d427b1a235d7fa32351d5747ea683e5f69de48d8d36b77c1c5cdf6b4dd7c28799a78d76f"

RPROVIDES:${PN} += "python3.10dist-xstatic-term.js \
python310-XStatic-term.js \
python3dist-xstatic-term.js"

RDEPENDS:${PN} += "python-abi"

inherit rpm
