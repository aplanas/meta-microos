SUMMARY = "Development Files for workrave"
DESCRIPTION = "This package contains header files needed for developing plugins for \
Workrave."
LICENSE = "GPL-3.0-only"

PV = "1.10.50"

RPM_NAME = "workrave-devel-1.10.50-2.3.aarch64.rpm"
RPM_HASH = "1c216bb215aef99c98f29e771600a6db1c89f4f6d35448d9e84582348e55056c376f412b4acdc55277c54b31e2848f5710c33f97633cc7a234f8d6a1562e2230"

RPROVIDES:${PN} += "workrave-devel"

RDEPENDS:${PN} += ""

inherit rpm
