SUMMARY = "generate new packages quickly and easily"
DESCRIPTION = "This module lets you quickly and easily construct new packages. It gives \
them unused names and sets up their package data, if provided."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.106"

RPM_NAME = "perl-Package-Generator-1.106-3.28.noarch.rpm"
RPM_HASH = "815d4ae67ef52c394c3b36d663c75b9e51874a98cd3bd051fa0a6297821d72e5346466811b390bfdf316db09f30a7f6b2570fb355042ba8fa21097cf5275f586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Package--Generator \
perl-Package--Reaper \
perl-Package-Generator"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
