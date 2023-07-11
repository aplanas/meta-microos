SUMMARY = "jQuery repackaged for the XStatic standard"
DESCRIPTION = "jQuery javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "3.5.1.1"

RPM_NAME = "python39-XStatic-jQuery-3.5.1.1-1.4.aarch64.rpm"
RPM_HASH = "7eeb4791464e6f073eb28ac5399a3ae3b9d456b2064cf2aa9382cb966b8b4c57c30da45b9dde38a7aa070f51fabb8c2714cb0f7dacc73fc12ac53c18c5ac6cd7"

RPROVIDES:${PN} += "python3.9dist-xstatic-jquery \
python39-XStatic-jQuery \
python3dist-xstatic-jquery"

RDEPENDS:${PN} += "python-abi"

inherit rpm
