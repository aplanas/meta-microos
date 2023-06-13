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

RPM_NAME = "perl-Config-Auto-0.44-3.26.noarch.rpm"
RPM_HASH = "a76df35a5119b48c0d6ffb2f9742a7edbe7c0efa5bd88f6fc43609a3f6d133834491ad3e60a18aac59cab65cd95379880177c18b785a56cea8a176284f23c8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Config::Auto) \
perl-Config-Auto"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Config::IniFiles) \
perl(IO::String) \
perl(YAML)"

inherit rpm
