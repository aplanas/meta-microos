SUMMARY = "Module for reading .ini-style configuration files"
DESCRIPTION = "Config::IniFiles provides a way to have readable configuration files \
outside your Perl script. Configurations can be imported (inherited, \
stacked,...), sections can be grouped, and settings can be accessed from a \
tied hash."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.000003"

RPM_NAME = "perl-Config-IniFiles-3.000003-1.15.noarch.rpm"
RPM_HASH = "c91153a47ca79463cb2933fedae86de1092e6b07ac255f6a72bd0a3f1bf68deda99045b0c3052ceaaa4c97600cca55b701723caf57ba45d3f8b5db25dc6969ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--IniFiles \
perl-Config--IniFiles---section \
perl-Config-IniFiles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--Scalar \
perl-List--Util"

inherit rpm
