SUMMARY = "Module for reading .ini-style configuration files"
DESCRIPTION = "Config::IniFiles provides a way to have readable configuration files \
outside your Perl script. Configurations can be imported (inherited, \
stacked,...), sections can be grouped, and settings can be accessed from a \
tied hash."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.000003"

RPM_NAME = "perl-Config-IniFiles-3.000003-1.14.noarch.rpm"
RPM_HASH = "c02c4f95563b4a2e60fb587d71f142dbbb067dedbb13f0c0b49e26aa4985df589fa0e5ab284c3b2066edfae1e0861c211d07525a9dfe75bbb138c6628a2b3ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--IniFiles \
perl-Config--IniFiles---section \
perl-Config-IniFiles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--Scalar \
perl-List--Util"

inherit rpm
