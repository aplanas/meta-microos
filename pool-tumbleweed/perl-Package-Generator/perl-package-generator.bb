SUMMARY = "generate new packages quickly and easily"
DESCRIPTION = "This module lets you quickly and easily construct new packages. It gives \
them unused names and sets up their package data, if provided."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.106"

RPM_NAME = "perl-Package-Generator-1.106-3.27.noarch.rpm"
RPM_HASH = "a90f20751fc26910cbbd73da2324328a89bb07aa037ee966f80db80be31aa2b54c3696e09a347c477bdd6047f4299f435c39274a0ffb46c27c41e8f8b5f4d21b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Package--Generator \
perl-Package--Reaper \
perl-Package-Generator"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
