SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python39-flup-1.0.3.dev20161029-3.1.noarch.rpm"
RPM_HASH = "79eef669af8353b8cdeeae29295d5c3143fcb9b2bffb0dcde94f6308e25e137cb9ea13b2c5d6302078cea407d4ca4d99319d2e73b2d09193e76c0cfc946c19c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flup) \
python39-flup \
python3dist(flup)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
