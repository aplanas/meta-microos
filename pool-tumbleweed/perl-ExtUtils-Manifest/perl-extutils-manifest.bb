SUMMARY = "Utilities to write and check a MANIFEST file"
DESCRIPTION = "..."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.75"

RPM_NAME = "perl-ExtUtils-Manifest-1.75-1.2.noarch.rpm"
RPM_HASH = "91e7dc9eeb1b7ae1e408bec5110fcc683d1bcdcb916d3a590f7d4178f841d494f2055b44b0b90f781c193213a93874924d5fb2d8173573c51adbf48ebdd0d8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Manifest \
perl-ExtUtils-Manifest"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
