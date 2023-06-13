SUMMARY = "Translations for package gcompris-qt"
DESCRIPTION = "Provides translations for the 'gcompris-qt' package."
LICENSE = "AGPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "gcompris-qt-lang-3.2-1.1.noarch.rpm"
RPM_HASH = "f25e49ab36f9d0d8c10a4c6528363fbf6ec0b788fc02c3cc531c1cb10d6d2be61f29fdcf7b7150bd739a543e1e7e9145798eac0eacb24a95dbd8aac37d65896f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcompris-qt-lang \
gcompris-qt-lang-all"

RDEPENDS:${PN} += "gcompris-qt"

inherit rpm
