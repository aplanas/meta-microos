SUMMARY = "Documentation files for uhd"
DESCRIPTION = "This package contains the documentation for the Universal Hardware Driver (UHD)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "uhd-doc-4.4.0.0-1.4.noarch.rpm"
RPM_HASH = "ceddf443caea4b023427ea4148b2bdaec06f2b5b180f31357d6fa2fa38b8b2c540f185de8f9e7704b90958140a60dbc0079286bab1247cc8c2dff2cb0a6d0ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uhd-doc"

RDEPENDS:${PN} += ""

inherit rpm
