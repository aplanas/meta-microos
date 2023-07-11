SUMMARY = "Documentation for the libwpd API"
DESCRIPTION = "This package contains documentation for the libwpd API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-devel-doc-0.10.3-3.9.noarch.rpm"
RPM_HASH = "4a1f88c4d5960f6cd7da65fd2f29bddba42c732b3cf1d967c824af77c6f97e60e30e0af95340529bc9e3f78db4be855c3642be84a7c30578705699c74a1c6086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwpd-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
