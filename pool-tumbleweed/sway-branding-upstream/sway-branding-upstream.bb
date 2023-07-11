SUMMARY = "Upstream branding of sway"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "sway-branding-upstream-1.8.1-2.2.noarch.rpm"
RPM_HASH = "b5995ae3574ed8e5a504066b88ff84651c667f6b8e0925d5acaed9de0548fd3fa2c50ff28892bba6ed1a759efef028089cbce0427436234e4837cbcd01b9c31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sway-branding-upstream \
sway-branding \
sway-branding-upstream"

RDEPENDS:${PN} += "sway"

inherit rpm
