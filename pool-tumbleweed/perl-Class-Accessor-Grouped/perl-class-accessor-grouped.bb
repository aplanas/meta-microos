SUMMARY = "Lets you build groups of accessors"
DESCRIPTION = "This class lets you build groups of accessors that will call different \
getters and setters. The documentation of this module still requires a lot \
of work (*volunteers welcome >.>*), but in the meantime you can refer to at \
http://lo-f.at/glahn/2009/08/WritingPowerfulAccessorsForPerlClasses.html \
for more information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10014"

RPM_NAME = "perl-Class-Accessor-Grouped-0.10014-1.17.noarch.rpm"
RPM_HASH = "02aec765321597f4842f2ca4fc70de6eae12791970e37a6cf399cf75ec00978b132d648bf0e922cb6fedac8d598b8d0f55c5d03328a2527fe5557eb219389fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Accessor--Grouped \
perl-Class-Accessor-Grouped"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--XSAccessor \
perl-Module--Runtime \
perl-Sub--Name"

inherit rpm
