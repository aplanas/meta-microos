SUMMARY = "Data files for libfm library"
DESCRIPTION = "Provides data to be read by libfm-qt"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "libfm-qt-data-1.3.0-1.4.noarch.rpm"
RPM_HASH = "81f06dbcf683bc528a245072f301183d498c8ed7f220a53a3029e48ec0f15ce32e3dc922fcaa069ce28af6d1c09a5dcc509cc35643d0b4dbc7d33d39d0d92827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-qt-data"

RDEPENDS:${PN} += ""

inherit rpm
