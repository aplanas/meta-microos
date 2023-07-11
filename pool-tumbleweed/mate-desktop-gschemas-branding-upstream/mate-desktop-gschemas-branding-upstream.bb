SUMMARY = "MATE Desktop GSchemas -- Upstream default settings"
DESCRIPTION = "This package contains the upstream default settings for \
MATE Desktop GSchemas."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-desktop-gschemas-branding-upstream-1.26.1-1.2.noarch.rpm"
RPM_HASH = "7c75af34e2e679f2e3ef1d87ad5b081b649f14e021392981461ef684b07055c90173780a6b9b8d38d4d07a25e2302ee18fc6802c54c98c498e3475c9d8ccd233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-desktop-gschemas-branding \
mate-desktop-gschemas-branding-upstream"

RDEPENDS:${PN} += "mate-desktop-gschemas"

inherit rpm
