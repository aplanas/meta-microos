SUMMARY = "Development files for golly"
DESCRIPTION = "This package contains header files and libraries needed to develop applications \
that use golly."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "golly-devel-4.2-2.1.aarch64.rpm"
RPM_HASH = "ecc8ba6a6758a923b35a7a6387cc3e7da344868fa9d85e3b94ce4380fee2ea53ca81e211ef946e5239c219c942341e44a70190a65fb24c71ff28c8cc24d92c11"

RPROVIDES:${PN} += "golly-devel \
golly-devel(aarch-64)"

RDEPENDS:${PN} += "golly"

inherit rpm
