SUMMARY = "Translations for package flacon"
DESCRIPTION = "Provides translations for the 'flacon' package."
LICENSE = "LGPL-2.1-or-later"

PV = "10.0.0"

RPM_NAME = "flacon-lang-10.0.0-1.3.noarch.rpm"
RPM_HASH = "09c241b208a186361e1688b01895cce4e85e4407ea31669cb4308b2b8d36c72edd8f9c0e018bf42c57e0569d16d75856ac6034c59836ffe0b46e7659c943bac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flacon-lang flacon-lang-all"
RDEPENDS:${PN} += "flacon"

inherit rpm
