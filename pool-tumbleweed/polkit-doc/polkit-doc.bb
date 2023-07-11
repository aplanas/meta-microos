SUMMARY = "Development documentation for PolicyKit"
DESCRIPTION = "Development documentation for PolicyKit Authorization Framework."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "polkit-doc-121-4.3.noarch.rpm"
RPM_HASH = "4d4287294542227782b30551cab78ea3a7caf2a949dea0255963b8519ae0eb6e4df826e76aa4c9de3e120761ff7cb4bb02e695167e36282a8ee0a14f19031391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "polkit-doc"

RDEPENDS:${PN} += ""

inherit rpm
