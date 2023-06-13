SUMMARY = "jQuery UI repackaged for the XStatic standard"
DESCRIPTION = "jquery-ui javascript library packaged for setuptools (easy_install) / pip. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.13.0.1"

RPM_NAME = "python311-XStatic-jquery-ui-1.13.0.1-1.8.noarch.rpm"
RPM_HASH = "bfd1bdddbf62ab63ea0d16c8c953538d6a47969a6c44f3c79f24b362637210d537702c5fc895c33222ef8b33e38f4b3fa8cf256916585357d810b90c0a2f2d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xstatic-jquery-ui) \
python311-XStatic-jquery-ui \
python3dist(xstatic-jquery-ui)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
