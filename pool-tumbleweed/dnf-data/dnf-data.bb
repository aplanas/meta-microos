SUMMARY = "Common data and configuration files for DNF"
DESCRIPTION = "This package provides the common data and configuration files for DNF."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "dnf-data-4.14.0-3.1.noarch.rpm"
RPM_HASH = "5e91d19eef485b79b7b4c99cc0bf849ed10e1c4696fabe837cb82edb12f89022f7ec492790cc991262480d5e177807ff18f4a61c18bdf505d255a236ab5f96ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dnf-data \
dnf-conf \
dnf-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
