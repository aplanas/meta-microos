SUMMARY = "AngularJS library 'objectpath' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.2.1.0"

RPM_NAME = "python39-XStatic-objectpath-1.2.1.0-1.15.noarch.rpm"
RPM_HASH = "ede42740e1a4b854c8c3d848711ed8d6147f55760083754d893d693389cb2da8eedf5059f75358a133e2be502fa7ea5afc8e9d89e1698c35f8d238c144144a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xstatic-objectpath) \
python39-XStatic-objectpath \
python3dist(xstatic-objectpath)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
