SUMMARY = "KDE Image Plug-In Interface - data files"
DESCRIPTION = "This package contains data files needed by the KDE image plug-in library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.08.0"

RPM_NAME = "libkipi-data-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "48d96883ca63832cebffca156ad5758bb203058193dfe44f63b4e8b80bbcad4d195ddc50940ef7b5677641f8c022a4dee20b9846fb9f47cd593471cf9e21cfdd"

RPROVIDES:${PN} += "libkipi-data"

RDEPENDS:${PN} += ""

inherit rpm
