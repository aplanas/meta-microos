SUMMARY = "Periodic Table of Elements"
DESCRIPTION = "Kalzium shows a periodic table of the elements."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kalzium-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "94b6349d6988102b5853e289ab24cc9516f91a2353a4f1df63af232f1504d7b4d2a3df587092cf86321d3e4573d5ab85342663594527859569f4dbe8e2d896c5"

RPROVIDES:${PN} += "kalzium-devel"

RDEPENDS:${PN} += "kalzium"

inherit rpm
