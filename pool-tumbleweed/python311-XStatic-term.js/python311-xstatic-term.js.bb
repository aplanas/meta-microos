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

RPM_NAME = "python311-XStatic-term.js-0.0.7.0-1.16.aarch64.rpm"
RPM_HASH = "4c52cc3f7236a5a4b55abdc2f8dad850c67dd460adc080792d1b48912b1ccfe765d65ec421cabb7a817e4e0ce2e624869d252313871c0a61a409fd555da98887"

RPROVIDES:${PN} += "python3-XStatic-term.js \
python3.11dist-xstatic-term.js \
python311-XStatic-term.js \
python3dist-xstatic-term.js"

RDEPENDS:${PN} += "python-abi"

inherit rpm
