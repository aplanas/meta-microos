SUMMARY = "Header and devel files for libfallocate"
DESCRIPTION = "This package contains the header file and the .so library to link \
against for apps that want to use libfallocate."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfallocate-devel-0.1.1-17.16.aarch64.rpm"
RPM_HASH = "f602c09e0b9780086c421a258579a114d6a7a40aef3909e7bb0388e7eaff42a596ed70aef6aaee44dc6035136d462893364b7cb8d070ffc1b5974e08f4f1a664"

RPROVIDES:${PN} += "libfallocate-devel"

RDEPENDS:${PN} += "libfallocate0"

inherit rpm
