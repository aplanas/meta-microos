SUMMARY = "Apparmor profile for Tor Browser"
DESCRIPTION = "This package provides the apparmor profiles to safeguard against \
a Tor network compromise."
LICENSE = "BSD-3-Clause"

PV = "0.3.6"

RPM_NAME = "torbrowser-apparmor-profile-0.3.6-1.3.noarch.rpm"
RPM_HASH = "bc8bfebe4eeff8ef0cbd9958ce5c9925fb244edbbb15f37e0c4113327ec91d9b6c6cf10897c59e96e6fdce5755e1039a73edd776939f351cc28b08822a322e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-torbrowser-apparmor-profile \
torbrowser-apparmor-profile"

RDEPENDS:${PN} += "apparmor-utils"

inherit rpm
