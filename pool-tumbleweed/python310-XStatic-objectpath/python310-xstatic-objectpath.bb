SUMMARY = "AngularJS library 'objectpath' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.2.1.0"

RPM_NAME = "python310-XStatic-objectpath-1.2.1.0-1.16.noarch.rpm"
RPM_HASH = "f5f99eb90b28c39e5779c543555f4756ef8306805ca9ae45a3cbf65311e19b365349d47021cd9aa3fafcc63775c812a6a3f1272477df43679b0c2def007c66e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xstatic-objectpath \
python310-XStatic-objectpath \
python3dist-xstatic-objectpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
