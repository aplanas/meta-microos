SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kmbox-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "c8b20f8e8a5dd6b3a270f66c983446e79e793007974fab47a26ef0c3850380149afb5d8e701b7548c99ebdff76f88d5f553cbc36fef3eedfb4ac73d2e020cfd1"

RPROVIDES:${PN} += "kmbox"

RDEPENDS:${PN} += ""

inherit rpm
