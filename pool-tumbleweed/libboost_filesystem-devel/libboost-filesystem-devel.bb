SUMMARY = "Development headers for Boost.Filesystem library"
DESCRIPTION = "Development headers for Boost.Filesystem library, a library providing \
facilities to manipulate files and directories, and the paths that \
identify them. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_filesystem-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "c0f9975d74f892b076a80630ea02fc97cbdee9e45d9dbcae370429a999d7f673278be4b895f345d53bf940f81a85c4db69ca5282118e835a976191d6903e2e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-filesystem-devel"

RDEPENDS:${PN} += "libboost-filesystem1-82-0-devel"

inherit rpm
