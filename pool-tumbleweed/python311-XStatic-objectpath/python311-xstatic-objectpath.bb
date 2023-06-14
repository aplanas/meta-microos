SUMMARY = "AngularJS library 'objectpath' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.2.1.0"

RPM_NAME = "python311-XStatic-objectpath-1.2.1.0-1.15.noarch.rpm"
RPM_HASH = "6c89f0a674b9e03590d0abdc287c881aedd18514aed1904f51a40ec129c9a41c7e07648ec561a3cd488e7afd57262b793a941e39bf464e1bd4a5576c76fdf15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-xstatic-objectpath \
python311-XStatic-objectpath \
python3dist-xstatic-objectpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
