SUMMARY = "JavaScript minifier"
DESCRIPTION = "JavaScript minifier."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-jsmin-3.0.1-1.6.noarch.rpm"
RPM_HASH = "ce408d95f220e1f6a4d8816cccba6c2bc34897b90e904ef509bb1fd3dd7757a4011505741f80caa8398274e225a748a8bd166c2ffad88f9da31a3420b06f9221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsmin \
python3.10dist(jsmin) \
python310-jsmin \
python3dist(jsmin)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
