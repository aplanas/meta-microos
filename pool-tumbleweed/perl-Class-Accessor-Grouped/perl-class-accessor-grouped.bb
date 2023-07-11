SUMMARY = "Lets you build groups of accessors"
DESCRIPTION = "This class lets you build groups of accessors that will call different \
getters and setters. The documentation of this module still requires a lot \
of work (*volunteers welcome >.>*), but in the meantime you can refer to at \
http://lo-f.at/glahn/2009/08/WritingPowerfulAccessorsForPerlClasses.html \
for more information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10014"

RPM_NAME = "perl-Class-Accessor-Grouped-0.10014-1.16.noarch.rpm"
RPM_HASH = "a3d4cf91180ca72c096f7ced6febc54e4d8a398dc5df34dfa587cf695da083b9b21713a7617acf96d23f3eb3ab4488c8f5ac0cad40e463f8dea843c6ed9e593d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Accessor--Grouped \
perl-Class-Accessor-Grouped"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--XSAccessor \
perl-Module--Runtime \
perl-Sub--Name"

inherit rpm
