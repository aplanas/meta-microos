SUMMARY = "Development headers for BLACS"
DESCRIPTION = "This package contains headers for BLACS."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "blacs-devel-headers-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "2f18e7832c2884c36c02b086fda14a24b476acc1c8f786e76c5e0d235a7591887e8236b7ba7d6f090cb9f132bb827633ddd282bd02ca42fc1b8208c1f2ab89c9"

RPROVIDES:${PN} += "blacs-devel-headers"

RDEPENDS:${PN} += ""

inherit rpm
