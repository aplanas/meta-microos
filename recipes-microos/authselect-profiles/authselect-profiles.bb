SUMMARY = "Authentication configuration profiles"
DESCRIPTION = "This package contains the configuration profiles offered by authselect to \
allow users to configure authentication on the system."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "authselect-profiles-1.4.0+git.0.2c30265-3.2.noarch.rpm"
RPM_HASH = "176a7cb19afb41b278cd41c5fef1834902cc76ed122dfbf887eb064b9294a1668da8e322e610986162701d412639942d57d4dfe92ea1623ef23dc47e156c3154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "authselect-profiles"
RDEPENDS:${PN} += "/bin/sh coreutils findutils gawk grep pam sed systemd"

inherit rpm
