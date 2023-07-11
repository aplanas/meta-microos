SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-hppa-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "553440644faf97494312c33d7c0673800d84b5625c81e6585e03a836cb3fbb822559d8cbf65ccb5d635bf0a7e7e27a50a14a01f51ff365c73f3e84907799b34a"

RPROVIDES:${PN} += "cross-hppa-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
