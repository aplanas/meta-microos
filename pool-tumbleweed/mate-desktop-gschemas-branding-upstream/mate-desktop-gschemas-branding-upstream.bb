SUMMARY = "MATE Desktop GSchemas -- Upstream default settings"
DESCRIPTION = "This package contains the upstream default settings for \
MATE Desktop GSchemas."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-desktop-gschemas-branding-upstream-1.26.1-1.1.noarch.rpm"
RPM_HASH = "dbe6ad5536eef83154444fe59a140a2312115f1ddc34a4f83a66c6ba8d661c554a0485e4ce2a38ec2eff78b58a9e5b2ea694b9519e25a727f05add40791b66ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-desktop-gschemas-branding \
mate-desktop-gschemas-branding-upstream"

RDEPENDS:${PN} += "mate-desktop-gschemas"

inherit rpm
