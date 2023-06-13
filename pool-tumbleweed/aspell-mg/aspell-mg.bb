SUMMARY = "Malagasy Dictionary for Aspell"
DESCRIPTION = "A Malagasy dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20040807"

RPM_NAME = "aspell-mg-20040807-2.14.aarch64.rpm"
RPM_HASH = "aaacbdf39e5dc00ee1d6d2756e213e0e7ab9ef8bd8aac4946d3d4977a34ecd1c1634151d2c0df3ea0032ab7c0636754dbe851449a644f68ebd450426d385b4ef"

RPROVIDES:${PN} += "aspell-mg \
aspell-mg(aarch-64) \
locale(aspell:mg)"

RDEPENDS:${PN} += ""

inherit rpm
