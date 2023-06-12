SUMMARY = "AngularJS library 'objectpath' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.2.1.0"

RPM_NAME = "python310-XStatic-objectpath-1.2.1.0-1.15.noarch.rpm"
RPM_HASH = "9fc40f5a660a34bb4494425ed96e8f340aae4a69621badad1c7776587cb7a49ef5cac39119982bc6b46cc2c35d1e7ed8e1f67367dcfe234b312fbbf83e99476d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-objectpath \
python3.10dist(xstatic-objectpath) \
python310-XStatic-objectpath \
python3dist(xstatic-objectpath)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
