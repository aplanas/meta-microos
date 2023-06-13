SUMMARY = "Development headers for BLACS"
DESCRIPTION = "This package contains headers for BLACS."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "blacs-devel-headers-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "a30fd53329538836544647b2dab4a1cceb5d87444c070ed2baec9ad6e2012992c0e770adbaf9ad895a71268466c8b7bfd2f7c7782fc8be3f084cd2f1f8535e0c"

RPROVIDES:${PN} += "blacs-devel-headers \
blacs-devel-headers(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
