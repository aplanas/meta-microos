SUMMARY = "Translations for package timeshift"
DESCRIPTION = "Provides translations for the 'timeshift' package."
LICENSE = "GPL-3.0-only"

PV = "22.11.2"

RPM_NAME = "timeshift-lang-22.11.2-1.3.noarch.rpm"
RPM_HASH = "48e927460a0e89b53f12703f6da6f7bf7f87a820c6533030a7daa487aa1ad68d03e72c83299fff332fc0b7c5a67740cca69f484d94f9c46dc5798a448bc29684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(timeshift:ar) \
locale(timeshift:az) \
locale(timeshift:bg) \
locale(timeshift:ca) \
locale(timeshift:cs) \
locale(timeshift:da) \
locale(timeshift:de) \
locale(timeshift:el) \
locale(timeshift:en_GB) \
locale(timeshift:es) \
locale(timeshift:et) \
locale(timeshift:eu) \
locale(timeshift:fi) \
locale(timeshift:fr) \
locale(timeshift:he) \
locale(timeshift:hi) \
locale(timeshift:hr) \
locale(timeshift:hu) \
locale(timeshift:ia) \
locale(timeshift:id) \
locale(timeshift:is) \
locale(timeshift:it) \
locale(timeshift:ja) \
locale(timeshift:ko) \
locale(timeshift:lt) \
locale(timeshift:nb) \
locale(timeshift:ne) \
locale(timeshift:nl) \
locale(timeshift:pl) \
locale(timeshift:pt) \
locale(timeshift:pt_BR) \
locale(timeshift:ro) \
locale(timeshift:ru) \
locale(timeshift:sk) \
locale(timeshift:sr) \
locale(timeshift:sv) \
locale(timeshift:tr) \
locale(timeshift:uk) \
locale(timeshift:vi) \
locale(timeshift:zh_CN) \
locale(timeshift:zh_TW) \
timeshift-lang \
timeshift-lang-all"
RDEPENDS:${PN} += "timeshift"

inherit rpm
