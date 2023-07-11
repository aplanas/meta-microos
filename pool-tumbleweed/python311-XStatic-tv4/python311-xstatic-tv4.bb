SUMMARY = "AngularJS library 'tv4' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.7.0"

RPM_NAME = "python311-XStatic-tv4-1.2.7.0-1.16.noarch.rpm"
RPM_HASH = "2d350e238bf73879024f1178aad96f512c8cdf775873ec977e4b9123a56d783b977d48333e26fcceeee6e7a49209d030a843430098ab79b8449aa8690e161336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-tv4 \
python3.11dist-xstatic-tv4 \
python311-XStatic-tv4 \
python3dist-xstatic-tv4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
