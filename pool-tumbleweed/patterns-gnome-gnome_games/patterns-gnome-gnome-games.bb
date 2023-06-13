SUMMARY = "GNOME Games"
DESCRIPTION = "GNOME Games"
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_games-20201210-16.1.aarch64.rpm"
RPM_HASH = "f66788538799329c1f2689b502385c8ac12fca8ed4bb47a40a5fc8440b4b65853c7212fe4f138750a8ea5b9b91299562f012ccdfc0253f6e177adc2e5f6cae71"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-gnome-gnome_games \
patterns-gnome-gnome_games(aarch-64) \
patterns-openSUSE-gnome_games"

RDEPENDS:${PN} += ""

inherit rpm
