SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-m68k-gcc7-icecream-backend-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "99188e1775b548bd21fde98b5fc159ab5e36552c20cd6411f8017c0f0fec1e85962add250587b47f8a2cbdcce451b75af5f6943e499f52b4ead492a4f522f520"

RPROVIDES:${PN} += "cross-m68k-gcc7-icecream-backend cross-m68k-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
