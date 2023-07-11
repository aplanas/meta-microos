SUMMARY = "Translations for package flacon"
DESCRIPTION = "Provides translations for the 'flacon' package."
LICENSE = "LGPL-2.1-or-later"

PV = "11.2.0"

RPM_NAME = "flacon-lang-11.2.0-1.1.noarch.rpm"
RPM_HASH = "e275bfdd14a5fdf87c8cf3279663450a1d7ad72aa76cac5c27c9ab92296a7128f3e31bb53a3f69d0ac9bf9658f88914c56def7ef8d59a934607007e683c1b799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flacon-lang \
flacon-lang-all"

RDEPENDS:${PN} += "flacon"

inherit rpm
