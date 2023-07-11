SUMMARY = "Include Files for Mupen64plus Development"
DESCRIPTION = "This package contains all necessary include files to develop frontends against \
the Mupen64plus shared library interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "libmupen64plus-devel-2.5.9-2.9.aarch64.rpm"
RPM_HASH = "3b807ec5ff5c5dfe14124b2f0ae0af1cc1d5d77cc397397370d22c97807c21be079999b024953e53703484e876f0ad0cf98cb81e49112278dc13f93e189d7502"

RPROVIDES:${PN} += "libmupen64plus-devel"

RDEPENDS:${PN} += "libmupen64plus2"

inherit rpm
