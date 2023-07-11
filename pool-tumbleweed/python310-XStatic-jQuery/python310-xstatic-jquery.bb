SUMMARY = "jQuery repackaged for the XStatic standard"
DESCRIPTION = "jQuery javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "3.5.1.1"

RPM_NAME = "python310-XStatic-jQuery-3.5.1.1-1.4.aarch64.rpm"
RPM_HASH = "148ee6550883b1f5370cb046242e1adfe090b90f705ddc8b3ee68782c7dd6ee9bb34f584aed24997d45bac58a9ccd57d0d4d6f1cc11fd857d5fd297418fa40f8"

RPROVIDES:${PN} += "python3.10dist-xstatic-jquery \
python310-XStatic-jQuery \
python3dist-xstatic-jquery"

RDEPENDS:${PN} += "python-abi"

inherit rpm
