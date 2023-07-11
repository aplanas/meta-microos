SUMMARY = "Development files for ibus-anthy"
DESCRIPTION = "The ibus-anthy-devel package includes the header files for the ibus-anthy package."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.14"

RPM_NAME = "ibus-anthy-devel-1.5.14-1.7.aarch64.rpm"
RPM_HASH = "bc26e2bd75a1ce11809a28a3548a408bb6f706b1265fd4de6a88874e585991f1dbe1a2005e8318e2a4ee06578887cfae7c38f0b0e448fc56cf22d79009af49f6"

RPROVIDES:${PN} += "ibus-anthy-devel"

RDEPENDS:${PN} += "ibus-anthy"

inherit rpm
