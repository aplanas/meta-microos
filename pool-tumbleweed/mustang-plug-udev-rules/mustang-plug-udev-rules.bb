SUMMARY = "Udev rules to grant access to Mustang amps"
DESCRIPTION = "Graphical interface to control amplifier and effect stages \
of Fender Mustang guitar amplifiers. \
 \
This sub-package contains udev rules granting access to the \
hardware for regular (non-root) users."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "mustang-plug-udev-rules-1.4.3-2.2.noarch.rpm"
RPM_HASH = "e1ec7761a7149cd025baef0d35d83ae228caf3440d55565ffdedf872263e4404b12606d90a07e48c8ba44c35dee219a3543f93c32d1e5f0ad4604a283027f024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mustang-plug-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
