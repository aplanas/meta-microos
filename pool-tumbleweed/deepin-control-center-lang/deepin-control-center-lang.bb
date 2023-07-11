SUMMARY = "Translations for package deepin-control-center"
DESCRIPTION = "Provides translations for the 'deepin-control-center' package."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.143"

RPM_NAME = "deepin-control-center-lang-5.5.143-1.8.noarch.rpm"
RPM_HASH = "ff6561645ee0a5c66ffdbb77f9055f1e272c9e8d524ae5b6e59ac90da7f864f73d673509f0f22579cc2377a36104aca2377a34d8248788ec79dd7783ea2250cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-control-center-lang \
deepin-control-center-lang-all"

RDEPENDS:${PN} += "deepin-control-center"

inherit rpm
