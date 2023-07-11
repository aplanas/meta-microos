SUMMARY = "jQuery UI repackaged for the XStatic standard"
DESCRIPTION = "jquery-ui javascript library packaged for setuptools (easy_install) / pip. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.13.0.1"

RPM_NAME = "python311-XStatic-jquery-ui-1.13.0.1-1.9.noarch.rpm"
RPM_HASH = "30895589958922af59c0392f967b4969ed6f48bc8ed5091e448a93dc1e055c134bed0cd5d06e2860c121810c47afc89df747d3053f9c9c0c9d8f66ee83fd3a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-jquery-ui \
python3.11dist-xstatic-jquery-ui \
python311-XStatic-jquery-ui \
python3dist-xstatic-jquery-ui"

RDEPENDS:${PN} += "python-abi"

inherit rpm
