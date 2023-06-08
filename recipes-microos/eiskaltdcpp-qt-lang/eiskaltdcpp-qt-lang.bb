SUMMARY = "Translations for package eiskaltdcpp-qt"
DESCRIPTION = "Provides translations for the 'eiskaltdcpp-qt' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-qt-lang-2.4.2-1.13.noarch.rpm"
RPM_HASH = "878488cd7fc3b946db1f6f294b8fa7f9eacce6a3a4564cc76c5ad6c244547c9f91b17a935ecbbb9ef306dae0332ffa94080c66cef56463ffbfdcb1f555e4f4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiskaltdcpp-qt-lang eiskaltdcpp-qt-lang-all"
RDEPENDS:${PN} += "eiskaltdcpp-qt"

inherit rpm
