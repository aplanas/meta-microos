SUMMARY = "Assets for golly"
DESCRIPTION = "This package contains assets for golly: Help, rules, patterns and scripts."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "golly-assets-4.2-2.2.noarch.rpm"
RPM_HASH = "66562a2e2cd2cb193cc0c4eaa5a3d2be8cd35b34a7ef0fdf6c01622df740e3a9a18e83837205f9e2f02b8b1cd1040418e457db3aa9aea25cd6dd01c0f752b1e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golly-assets"

RDEPENDS:${PN} += ""

inherit rpm
