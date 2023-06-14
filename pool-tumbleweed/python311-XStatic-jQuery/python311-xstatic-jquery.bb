SUMMARY = "jQuery repackaged for the XStatic standard"
DESCRIPTION = "jQuery javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "3.5.1.1"

RPM_NAME = "python311-XStatic-jQuery-3.5.1.1-1.3.aarch64.rpm"
RPM_HASH = "3dabb90667b51afb792926fa6f73805f8e20a8e6bb022fef77492ef08c41d4e172b44f7f494a4c91ef0e17c2dfdf7b0894358cd81d99f4baf697da5676637b2f"

RPROVIDES:${PN} += "python3.11dist-xstatic-jquery \
python311-XStatic-jQuery \
python3dist-xstatic-jquery"

RDEPENDS:${PN} += "python-abi"

inherit rpm
