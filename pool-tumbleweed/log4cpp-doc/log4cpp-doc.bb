SUMMARY = "HTML formatted API documention for Log for C++"
DESCRIPTION = "The log4cpp-doc package contains HTML formatted API documention generated by \
the popular doxygen documentation generation tool."
LICENSE = "LGPL-2.1-only"

PV = "1.1.3"

RPM_NAME = "log4cpp-doc-1.1.3-2.20.noarch.rpm"
RPM_HASH = "cf8410f4451c6a12ec302ea48807fdafd825b5f614db1d7e3735a6d385cfdd2c011953cce8af6277bf05c0f7ff2a02f8749599e5ffd1c304391a52dff6437d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4cpp-doc"

RDEPENDS:${PN} += ""

inherit rpm
