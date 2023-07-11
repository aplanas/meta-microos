SUMMARY = "Pidgin plugin for SkypeWeb API"
DESCRIPTION = "This is a SkypeWeb Plugin for Pidgin. It lets you view and chat \
with all your Skype buddies from within Pidgin."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "pidgin-plugin-skypeweb-1.7-1.4.aarch64.rpm"
RPM_HASH = "1fa1c9254d53cf39aecd06570fdad3ba3a5f91aeed828ca8feb10e20eecfd50844e880607d7854cebd65e8e5e421069bb11190b9436ec200990ede01cd39ad38"

RPROVIDES:${PN} += "pidgin-plugin-skypeweb"

RDEPENDS:${PN} += "libpurple-plugin-skypeweb \
pidgin"

inherit rpm
