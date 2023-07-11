SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-arm-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "36dc199758fd47096926f046136d1fa0b8246ac4c34a7cb0231ba753b931dcf1f34d0cde931fbbb04d7c8ab54b33a73e135834c71225e6d0a6ed8d2d77e8ade1"

RPROVIDES:${PN} += "cross-arm-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
