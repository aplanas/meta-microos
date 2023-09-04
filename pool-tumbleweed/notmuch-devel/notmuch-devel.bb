SUMMARY = "Development files for notmuch"
DESCRIPTION = "The notmuch-devel package contains libraries and header files for \
developing applications that use notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-devel-0.37-3.1.aarch64.rpm"
RPM_HASH = "99ea5c65748b9a6f8d82516da1049c0eac5dedf56f86f8158ef86854f6b63d951d11974d609e19647b96ff8c5b7a9ca661b5953974f7f910d8657fb7177ac9a3"

RPROVIDES:${PN} += "notmuch-devel"

RDEPENDS:${PN} += "libnotmuch5"

inherit rpm
