SUMMARY = "RPM macros used to setup apparmor profiles"
DESCRIPTION = "Package that provides RPM macros used to setup apparmor profiles for packaging."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "apparmor-rpm-macros-1.0-7.1.noarch.rpm"
RPM_HASH = "b2aa367990f20946a24ef649e6e1d19c75905217f5d6fb90248cb9d8e49899f6d400799b53adde152c1b0fcdc8de56d923f964d6145e53ffa8795c7305d191f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-rpm-macros \
rpm-macro-apparmor-reload"

RDEPENDS:${PN} += "coreutils"

inherit rpm
