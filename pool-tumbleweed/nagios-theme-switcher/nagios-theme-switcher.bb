SUMMARY = "Simple Theme Switcher for Nagios Webfrontend"
DESCRIPTION = "This package contains a simple script with configures Nagios to use \
a theme below /usr/share/nagios."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "nagios-theme-switcher-1.4-2.15.noarch.rpm"
RPM_HASH = "9a6842e5eac58f844538f6873111ea5c5800358bf3741c6ad0b6b601d922f3b46462a6f7fc7ac6ec8193a75f361930b43a188eb9cda5cebe46daedb1fef53f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-theme-switcher"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
