SUMMARY = "Looking up module information / loading at runtime"
DESCRIPTION = "Module::Load::Conditional provides simple ways to query and possibly load \
any of the modules you have installed on your system during runtime. \
 \
It is able to load multiple modules at once or none at all if one of them \
was not able to load. It also takes care of any error checking and so \
forth."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.74"

RPM_NAME = "perl-Module-Load-Conditional-0.74-1.14.noarch.rpm"
RPM_HASH = "eeb5b2540fdded687e602f33ed35c1173061e817e261e49c4fa44741ddf6c1525bdad7e266c31b4096d335ab589bfff0a096564b47aa825420742dbfdbba67f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Load--Conditional \
perl-Module-Load-Conditional"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Locale--Maketext--Simple \
perl-Module--CoreList \
perl-Module--Load \
perl-Module--Metadata \
perl-Params--Check \
perl-version"

inherit rpm
