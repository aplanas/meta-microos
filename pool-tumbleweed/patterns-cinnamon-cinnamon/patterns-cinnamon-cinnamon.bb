SUMMARY = "Cinnamon Desktop Environment"
DESCRIPTION = "Cinnamon is a modern Linux desktop which provides advanced innovative \
features and a traditional user experience. It's easy to use, \
powerful and flexible."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "202021205"

RPM_NAME = "patterns-cinnamon-cinnamon-202021205-2.7.aarch64.rpm"
RPM_HASH = "aa379f3baaa6c18b30b6c184b591c338e94335f1fbf79076547281f19f665ffdde71ebac07ae1a639221a5555c16764d1555b34116fbcfe4c43a61a7592336df"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-cinnamon-cinnamon \
patterns-cinnamon-cinnamon(aarch-64) \
patterns-openSUSE-cinnamon"

RDEPENDS:${PN} += "pattern()"

inherit rpm
