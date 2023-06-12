SUMMARY = "Upstream Branding for awesome"
DESCRIPTION = "This package provides the upstream look and feel for awesome."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "awesome-branding-upstream-4.3-4.13.noarch.rpm"
RPM_HASH = "e0c988acab85fa62f0497cd51f5def32d301335237df471f8f141110da13950a15a7ed3b0ccd8c9b46f6390b8b32d96b92a61ef90cbe333f67476724315858a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-branding \
awesome-branding-upstream \
config(awesome-branding-upstream)"
RDEPENDS:${PN} += "awesome"

inherit rpm
