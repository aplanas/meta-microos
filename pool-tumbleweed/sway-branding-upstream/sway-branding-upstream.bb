SUMMARY = "Upstream branding of sway"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "sway-branding-upstream-1.8.1-2.1.noarch.rpm"
RPM_HASH = "ff179ea17879b2fba345d029d111aba1959ce6a3df6a8069ed7b11b459917491c4ba21813329d95f27cde01b9f59479ee59dfc1488e069535a5cffa456b6597b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sway-branding-upstream \
sway-branding \
sway-branding-upstream"

RDEPENDS:${PN} += "sway"

inherit rpm
