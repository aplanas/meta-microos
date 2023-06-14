SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-x86_64-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "7dabf809bb81203e8d144bd71377b5e767e26b7f366999d49659263b15bde4e232884c709ad29117c91649cf4f81d992695469b108a69e344d8e8d41c099fb41"

RPROVIDES:${PN} += "cross-x86-64-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
