SUMMARY = "General Data for KDE Games"
DESCRIPTION = "This package contains data which is required by KDE games."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkmahjongg-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a1f4f1da9dec735793b9e788a36d9cc4feea456ece55304b3bf56b21782c640d47204170f00465897098c1ea0738995729af7027d292e5a21a6c9f5906ea4e99"

RPROVIDES:${PN} += "libkmahjongg \
libkmahjongg-kf5"

RDEPENDS:${PN} += ""

inherit rpm
