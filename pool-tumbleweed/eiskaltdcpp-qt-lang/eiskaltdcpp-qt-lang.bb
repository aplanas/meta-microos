SUMMARY = "Translations for package eiskaltdcpp-qt"
DESCRIPTION = "Provides translations for the 'eiskaltdcpp-qt' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-qt-lang-2.4.2-1.14.noarch.rpm"
RPM_HASH = "0e7374f0aa3f75ae000985e715e3aa97bfbdeccf0f803769a6500092da44a4190fef4107cb67a239c870d87defd99b24c60b207e40e1ea0b5ca9958f4a76138f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiskaltdcpp-qt-lang \
eiskaltdcpp-qt-lang-all"

RDEPENDS:${PN} += "eiskaltdcpp-qt"

inherit rpm
