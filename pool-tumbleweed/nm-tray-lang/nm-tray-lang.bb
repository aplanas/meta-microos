SUMMARY = "Translations for package nm-tray"
DESCRIPTION = "Provides translations for the 'nm-tray' package."
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "nm-tray-lang-0.5.0-1.8.noarch.rpm"
RPM_HASH = "10384d78f1b4b06eaf4233fdac738817306e9e190715cf6e77399c35781f43a3829d2fe6fd93120e1c90431bb7e2ce1ab99f34b6339ae64131cae94cae8951ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nm-tray-lang \
nm-tray-lang-all"

RDEPENDS:${PN} += "nm-tray"

inherit rpm
