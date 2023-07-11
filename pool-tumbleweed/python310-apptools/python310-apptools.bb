SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "python310-apptools-5.2.0-1.5.noarch.rpm"
RPM_HASH = "2b06d8250d8ca377a288f6130f3c18ca23a88f7f75874035245f0376e85c8578d8b03cf9fd4fb287e615fef2478c1a8ef4394cf2c0d86cf2e3ab928a3a43b3d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-apptools \
python310-apptools \
python3dist-apptools"

RDEPENDS:${PN} += "python-abi \
python310-configobj \
python310-traits"

inherit rpm
