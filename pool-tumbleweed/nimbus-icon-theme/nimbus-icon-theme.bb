SUMMARY = "Nimbus Icon Theme"
DESCRIPTION = "Nimbus is the name of a look-and-feel designed by Sun for the Java \
Desktop System."
LICENSE = "LGPL-2.0+"

PV = "0.1.7"

RPM_NAME = "nimbus-icon-theme-0.1.7-13.28.noarch.rpm"
RPM_HASH = "a01fecd1896311e4463b96511181a44de298a8b932efd2f0d566a6e0bd34175648c87880544974ff7421847eeabcd4e4846f30d5a8d707d97018473a87725d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nimbus-icon-theme"

RDEPENDS:${PN} += "/bin/sh \
tango-icon-theme"

inherit rpm
