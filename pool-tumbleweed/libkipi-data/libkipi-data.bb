SUMMARY = "KDE Image Plug-In Interface - data files"
DESCRIPTION = "This package contains data files needed by the KDE image plug-in library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.04.3"

RPM_NAME = "libkipi-data-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d8891237e9070679a8d122cffd0e65315e920e7d8319217ae0ba58beda6766bdb77c071925ca6ae72070269241419c4644b65b179b2745f15a40ee158ff6afee"

RPROVIDES:${PN} += "libkipi-data"

RDEPENDS:${PN} += ""

inherit rpm
