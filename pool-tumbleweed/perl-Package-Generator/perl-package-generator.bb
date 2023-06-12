SUMMARY = "generate new packages quickly and easily"
DESCRIPTION = "This module lets you quickly and easily construct new packages. It gives \
them unused names and sets up their package data, if provided."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.106"

RPM_NAME = "perl-Package-Generator-1.106-3.26.noarch.rpm"
RPM_HASH = "e7c6d84303d834caffdc260383ad8b05acc2ed5c8a275df613388c3c00d59112a6c7b1dc4b27fee31edea7ba5e6ae13ca6c2a359ae7e61fccfe031deb253edb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Package::Generator) \
perl(Package::Reaper) \
perl-Package-Generator"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
