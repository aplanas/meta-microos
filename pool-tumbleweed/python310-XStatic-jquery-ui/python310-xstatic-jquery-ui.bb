SUMMARY = "jQuery UI repackaged for the XStatic standard"
DESCRIPTION = "jquery-ui javascript library packaged for setuptools (easy_install) / pip. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.13.0.1"

RPM_NAME = "python310-XStatic-jquery-ui-1.13.0.1-1.9.noarch.rpm"
RPM_HASH = "63e684c5736f7fe4acce49c5df181439e7bfddcc2472d49e4d17f3384440021759d7a349bc42e68301708e6710ac20e73a9a07ff44ca60a45ade7be2b13fb981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xstatic-jquery-ui \
python310-XStatic-jquery-ui \
python3dist-xstatic-jquery-ui"

RDEPENDS:${PN} += "python-abi"

inherit rpm
