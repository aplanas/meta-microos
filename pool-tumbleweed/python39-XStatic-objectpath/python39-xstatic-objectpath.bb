SUMMARY = "AngularJS library 'objectpath' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.2.1.0"

RPM_NAME = "python39-XStatic-objectpath-1.2.1.0-1.16.noarch.rpm"
RPM_HASH = "f4bdb529c5ef22c416ca263c01271684c83883fd39d96923566fbc44de2dac6060642a0b7a757507a79a7f7fb7d04c40af1862bccd92ce46502bc6a841e0137b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xstatic-objectpath \
python39-XStatic-objectpath \
python3dist-xstatic-objectpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
