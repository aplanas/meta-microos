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

RPM_NAME = "perl-Config-Auto-0.44-3.27.noarch.rpm"
RPM_HASH = "07d6437ff6161714f5f2dff5ab4c61358b9298126a891cbeaefd71a28a7db8b96c9e93c6441cd65c60ad9bd5bc3a6b1db9b58c4b0cb489f201aeb9e635e4fb18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Auto \
perl-Config-Auto"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Config--IniFiles \
perl-IO--String \
perl-YAML"

inherit rpm
