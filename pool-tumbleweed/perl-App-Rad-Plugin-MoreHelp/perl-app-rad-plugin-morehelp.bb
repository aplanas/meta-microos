SUMMARY = "App::Rad plugin for providing extra help info"
DESCRIPTION = "This is an App::Rad manpage plugin for providing extra help info. It \
provides a 'more_help' method which can be used to provide extra info that \
will be appended to to bottom of the help message."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0001"

RPM_NAME = "perl-App-Rad-Plugin-MoreHelp-0.0001-2.23.noarch.rpm"
RPM_HASH = "582aaea7130b7a2b3729d8ca58542785bd9eaccc4a5e51571b8c88f76cb35dce3ae060f942933a672edf7eb1a05c489ae3ad2c21dedf3a4b77a09a4564258bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(App::Rad::Plugin::MoreHelp) \
perl-App-Rad-Plugin-MoreHelp"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(App::Rad)"

inherit rpm
