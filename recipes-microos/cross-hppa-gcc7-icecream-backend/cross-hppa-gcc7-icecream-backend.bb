SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-hppa-gcc7-icecream-backend-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "6309567b3efce839d82d095af1a6bcc2cd783ab3de61b2047d654fc57a633341bc4925caac6e56f0e1696bb0298b49f7bb58e0122cf943094b92c17b6d1b2c05"

RPROVIDES:${PN} += "cross-hppa-gcc7-icecream-backend cross-hppa-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
