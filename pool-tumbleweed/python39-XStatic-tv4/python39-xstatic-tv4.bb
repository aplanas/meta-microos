SUMMARY = "AngularJS library 'tv4' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.7.0"

RPM_NAME = "python39-XStatic-tv4-1.2.7.0-1.16.noarch.rpm"
RPM_HASH = "e9d285649f1a1c0b94daac7a2c41c2a8bacdd6fda84114c2460877aa64beba6b960a8a2cd31aa3576c08644b7cb0cc0e599d2d9082dd597c97ad1b6f066d61b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xstatic-tv4 \
python39-XStatic-tv4 \
python3dist-xstatic-tv4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
