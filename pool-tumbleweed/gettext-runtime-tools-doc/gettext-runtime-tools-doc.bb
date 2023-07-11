SUMMARY = "HTML documentation and examples for gettext-runtime"
DESCRIPTION = "This subpackage contains the HTML version of the gettext documentation \
as well as project examples."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-runtime-tools-doc-0.21.1-2.2.noarch.rpm"
RPM_HASH = "837d2794d91300874f5da11d8b1ad989479bea1c8a55a42e6b7d3f8ea0180e89f72f3307de8d3c66aeea10c66fca650798dff3609c3df9e5a62f7651c3ac3dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-runtime-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
