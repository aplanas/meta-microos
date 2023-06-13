SUMMARY = "Development files for backward-cpp"
DESCRIPTION = "Development files for backward-cpp, a stack trace printer for C++."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "backward-cpp-devel-1.6-2.2.noarch.rpm"
RPM_HASH = "606aa31372be07e5318c0aa6aff9cb63409139fad770c9b09b0f027f801e22aa2837f75ebd22d07f7137469f2a46ac71414f32a97b22e6b8362739c66ace1c54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "backward-cpp-devel"

RDEPENDS:${PN} += ""

inherit rpm
