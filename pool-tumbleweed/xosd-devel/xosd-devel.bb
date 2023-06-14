SUMMARY = "X On-Screen Display library development files"
DESCRIPTION = "Development headers and libraries for xosd package"
LICENSE = "GPL-2.0-or-later"

PV = "2.2.14"

RPM_NAME = "xosd-devel-2.2.14-1.1.aarch64.rpm"
RPM_HASH = "c385508395fb06d7a1b36fe5ab1a53b4820939b85dd6665eff41797ab6e7c7f26e7822863cfb8bd9b80f1c18cc8277534bb06dc11aa84f1c42855608517013bc"

RPROVIDES:${PN} += "xosd-devel"

RDEPENDS:${PN} += "/bin/sh \
xosd"

inherit rpm
