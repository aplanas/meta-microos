SUMMARY = "jQuery repackaged for the XStatic standard"
DESCRIPTION = "jQuery javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "3.5.1.1"

RPM_NAME = "python311-XStatic-jQuery-3.5.1.1-1.4.aarch64.rpm"
RPM_HASH = "48d688ca07436639377fa9ab6cf1058067f628dd459972b782f61ba8d7b8d5a2fa6104e57140d23939c5fbf9134cfc8048859936c641d2167f1c32b2cb78c9ef"

RPROVIDES:${PN} += "python3-XStatic-jQuery \
python3.11dist-xstatic-jquery \
python311-XStatic-jQuery \
python3dist-xstatic-jquery"

RDEPENDS:${PN} += "python-abi"

inherit rpm
