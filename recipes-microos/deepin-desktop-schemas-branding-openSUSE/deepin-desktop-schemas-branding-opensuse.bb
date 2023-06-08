SUMMARY = "openSUSE Branding of the Deepin Desktop Environment"
DESCRIPTION = "This package provides the openSUSE definition for Deepin Desktop GSchemas."
LICENSE = "GPL-2.0-or-later"

PV = "15.4"

RPM_NAME = "deepin-desktop-schemas-branding-openSUSE-15.4-2.2.noarch.rpm"
RPM_HASH = "f679354f7fee2a538d2140039846b53d918b3cdc99e8cbce53ba8d752c09591950627db02a72a6554968c84b64da9e22626917be9f4ad503dd629ae8447d3003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-desktop-schemas-branding deepin-desktop-schemas-branding-openSUSE"
RDEPENDS:${PN} += "deepin-desktop-schemas"

inherit rpm
