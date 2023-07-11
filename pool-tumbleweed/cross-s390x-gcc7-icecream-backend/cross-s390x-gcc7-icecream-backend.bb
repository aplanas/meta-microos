SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-s390x-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "e362fabdaa73e59b454f3e74255657afe11bee4fc74391bc157d24cae7480f9dbe309dd0d5d53cda8b42ba7c76806daf0149e16eae9d75b67acdec15bdf6fea7"

RPROVIDES:${PN} += "cross-s390x-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
