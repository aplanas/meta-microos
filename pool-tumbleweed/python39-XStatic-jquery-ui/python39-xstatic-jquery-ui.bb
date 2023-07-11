SUMMARY = "jQuery UI repackaged for the XStatic standard"
DESCRIPTION = "jquery-ui javascript library packaged for setuptools (easy_install) / pip. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.13.0.1"

RPM_NAME = "python39-XStatic-jquery-ui-1.13.0.1-1.9.noarch.rpm"
RPM_HASH = "4522a5193c3d1a4f997701c3d8f69289286d16dda176ece2fedc9afd883758b3190f00798dc22210dc21de389a89b5b1e2cca9be52572b61790593e3d58c0131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xstatic-jquery-ui \
python39-XStatic-jquery-ui \
python3dist-xstatic-jquery-ui"

RDEPENDS:${PN} += "python-abi"

inherit rpm
