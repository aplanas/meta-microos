SUMMARY = "Translations for package deepin-launcher"
DESCRIPTION = "Provides translations for the 'deepin-launcher' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.31"

RPM_NAME = "deepin-launcher-lang-5.5.31-2.3.noarch.rpm"
RPM_HASH = "7f81ad6e61f2979cae4765e80fed8a6d3dd63a7a3bebc2c5dca5faa64a9503d0330ec7f9ff1ad68f3e6aaaba713ae54b9eff110183643239ac2f650d42c81058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-launcher-lang \
deepin-launcher-lang-all"

RDEPENDS:${PN} += "deepin-launcher"

inherit rpm
