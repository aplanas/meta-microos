SUMMARY = "Apparmor profile for Tor Browser"
DESCRIPTION = "This package provides the apparmor profiles to safeguard against \
a Tor network compromise."
LICENSE = "BSD-3-Clause"

PV = "0.3.6"

RPM_NAME = "torbrowser-apparmor-profile-0.3.6-1.2.noarch.rpm"
RPM_HASH = "1b161bea5a960a203990f42797cd539fcd0427cedc044706245ee277f6ced358981ad2a70de25474941752d907e0655659a4078dc0143bdadbe496832585dab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(torbrowser-apparmor-profile) \
torbrowser-apparmor-profile"

RDEPENDS:${PN} += "apparmor-utils"

inherit rpm
