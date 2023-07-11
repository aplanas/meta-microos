SUMMARY = "Translations for package rsvndump"
DESCRIPTION = "Provides translations for the 'rsvndump' package."
LICENSE = "GPL-3.0-only"

PV = "0.6.1"

RPM_NAME = "rsvndump-lang-0.6.1-1.4.noarch.rpm"
RPM_HASH = "b04730694529d8552c907f38f791b1207ab87e57e61e16411674169ba2292edea1174b786c824b66dd01fddbd7624fa8aca7e08f201023e1ea71348a2fce551b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rsvndump-de \
rsvndump-lang \
rsvndump-lang-all"

RDEPENDS:${PN} += "rsvndump"

inherit rpm
