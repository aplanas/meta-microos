SUMMARY = "Translations for package kid3-core"
DESCRIPTION = "Provides translations for the 'kid3-core' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-core-lang-3.9.3-1.3.noarch.rpm"
RPM_HASH = "c073d348b19f99ea70c2f08cd16de16eecd55b5fe0de74ab36f6c81ceac5e1cf6d9677b2d6c7559187687d9522778a2643d1a5dfef71a780dc47f4b0c73cad21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kid3-core-lang \
kid3-core-lang-all"
RDEPENDS:${PN} += "kid3-core"

inherit rpm
