SUMMARY = "Simple, sane and efficient module to slurp a file"
DESCRIPTION = "This module provides functions for fast and correct slurping and spewing. \
All functions are optionally exported. All functions throw exceptions on \
errors, write functions don't return any meaningful value."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.014"

RPM_NAME = "perl-File-Slurper-0.014-1.4.noarch.rpm"
RPM_HASH = "f34d9e494f6ddeca76e22d32cf92cb0a56481fc854069291c91e9fba2ec6aeabb95ad6ff6bda9dcc6239262b965242cbc2cd3ae2477f3fc574e280ae5c47211a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurper \
perl-File-Slurper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
