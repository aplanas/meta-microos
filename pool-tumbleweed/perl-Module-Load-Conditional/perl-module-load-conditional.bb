SUMMARY = "Looking up module information / loading at runtime"
DESCRIPTION = "Module::Load::Conditional provides simple ways to query and possibly load \
any of the modules you have installed on your system during runtime. \
 \
It is able to load multiple modules at once or none at all if one of them \
was not able to load. It also takes care of any error checking and so \
forth."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.74"

RPM_NAME = "perl-Module-Load-Conditional-0.74-1.13.noarch.rpm"
RPM_HASH = "38e9931a59584fa6003d2fd3674de5bd3c41a69cccfb845123f465ec3fe206857d1c1f0c1bc6231151260bfc22dd46d43da7681bc8f28dc0724ee0099d7fe861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Load--Conditional \
perl-Module-Load-Conditional"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Locale--Maketext--Simple \
perl-Module--CoreList \
perl-Module--Load \
perl-Module--Metadata \
perl-Params--Check \
perl-version"

inherit rpm
