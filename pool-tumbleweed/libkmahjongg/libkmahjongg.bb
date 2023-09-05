SUMMARY = "General Data for KDE Games"
DESCRIPTION = "This package contains data which is required by KDE games."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkmahjongg-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "106d1a6fd14b207778888ec12715899adb196f6107dad49c87ef30d6f0bce6e0a6f5c3c3459da61d33bcaee1399d026d4305a663735253c8718e1cd4469a3c4b"

RPROVIDES:${PN} += "libkmahjongg \
libkmahjongg-kf5"

RDEPENDS:${PN} += ""

inherit rpm
