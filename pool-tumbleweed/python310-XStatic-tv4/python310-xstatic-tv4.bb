SUMMARY = "AngularJS library 'tv4' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.7.0"

RPM_NAME = "python310-XStatic-tv4-1.2.7.0-1.15.noarch.rpm"
RPM_HASH = "dd1165dbc7192ad041729ad818bf7383a4d04a7e1abe56b3643da4c1374c5de661572dbe5076ba2e938debd58c62b290e578e9f5950c982ca6aa5615de0f1b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-tv4 \
python3.10dist-xstatic-tv4 \
python310-XStatic-tv4 \
python3dist-xstatic-tv4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
