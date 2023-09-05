SUMMARY = "Base KDE PIM library for mail-handling applications"
DESCRIPTION = "The mailcommon library is a KDE PIM project to provide a \
framework to build applications which handle e-mail."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "mailcommon-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0cf51f680485dd8f185849b8e5df2ce466f05397b6882c7cc92d5fe6ec5b7dd0b1ffd8cfd877a201dd9acd7fb24ebd2f1df5baafc5a11159933a6e2217dc66e4"

RPROVIDES:${PN} += "mailcommon"

RDEPENDS:${PN} += ""

inherit rpm
