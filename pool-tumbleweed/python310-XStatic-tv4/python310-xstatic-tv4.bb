SUMMARY = "AngularJS library 'tv4' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.7.0"

RPM_NAME = "python310-XStatic-tv4-1.2.7.0-1.16.noarch.rpm"
RPM_HASH = "69356f0eac9b3c3ef5e2df934a801a39b4414c7f828a0dafcaa5b8121e36e99a1b95ace70140bd634088717deb39dfb2119cc967b7ee1285ba8f801ebf4e03af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xstatic-tv4 \
python310-XStatic-tv4 \
python3dist-xstatic-tv4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
