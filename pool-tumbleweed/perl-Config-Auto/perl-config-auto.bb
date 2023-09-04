SUMMARY = "Magical config file parser"
DESCRIPTION = "This module was written after having to write Yet Another Config File \
Parser for some variety of colon-separated config. I decided 'never again'. \
 \
Config::Auto aims to be the most 'DWIM' config parser available, by \
detecting configuration styles, include paths and even config filenames \
automagically. \
 \
See the the HOW IT WORKS manpage section below on implementation details."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.44"

RPM_NAME = "perl-Config-Auto-0.44-3.28.noarch.rpm"
RPM_HASH = "c21e5ac2d0bdf21fd60e4d5fb7e723e85ee904a5cdd7df87a455a20f9e2255fee62f8ea5b5d97d4990dbf38aa8c7772a841c3fa48eeb1f3bdd59c9b29a44564f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Auto \
perl-Config-Auto"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Config--IniFiles \
perl-IO--String \
perl-YAML"

inherit rpm
