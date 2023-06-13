SUMMARY = "Documentation for wcslib library"
DESCRIPTION = "This package contains documentation and help files for wcslib library."
LICENSE = "LGPL-3.0-or-later"

PV = "7.12"

RPM_NAME = "wcslib-doc-7.12-1.6.noarch.rpm"
RPM_HASH = "60b543275e34fe866deb1d27db6beaaf1a131233559732294f929b2d2842b711f55b9cd197396f3b64cda85324f1a29dd18b2ef63b22891c049ffccabc69e150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwcs-doc \
wcslib-doc"

RDEPENDS:${PN} += ""

inherit rpm
