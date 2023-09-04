SUMMARY = "Developer documentation for sdbus-cpp"
DESCRIPTION = "READMEs and generated doxygen documentation for sdbus-cpp"
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "sdbus-cpp-devel-doc-1.3.0-1.1.noarch.rpm"
RPM_HASH = "854a1ebd07d94af180f2316912c7b4d430d06ea6dba7f79002c22c6cca6b4121f735b13c3285bf2d666aabf9d47b2354ac194e752ed42f5a41e9bd228dec0ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbus-cpp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
