SUMMARY = "A brain teaser game and trainer"
DESCRIPTION = "gbrainy is a brain teaser game and trainer to have fun and to keep \
your brain trained. \
 \
It provides the following types of games: \
 \
* Logic puzzles. Games designed to challenge your reasoning and \
  thinking skills. \
 \
* Mental calculation. Games based on arithmetical operations \
  designed to prove your mental calculation skills. \
 \
* Memory trainers. Games designed to challenge your short term \
  memory. \
 \
* Verbal analogies. Games that challenge your verbal aptitude."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.6"

RPM_NAME = "gbrainy-2.4.6-1.2.noarch.rpm"
RPM_HASH = "5aa18f61ac3956077743eeed856981634a090bcfd0c74fad9e718552652717b490e6bd6e1fdb4b65aafb5732967e7ea7e08c0b18b23516207f137bf2541c87ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(gbrainy.desktop) gbrainy metainfo() metainfo(gbrainy.appdata.xml) mono(gbrainy) mono(gbrainy.Core) mono(gbrainy.Games)"
RDEPENDS:${PN} += "/bin/bash mono(Mono.CSharp) mono(Mono.Posix) mono(System) mono(System.Core) mono(System.Xml) mono(cairo-sharp) mono(gdk-sharp) mono(glib-sharp) mono(gtk-sharp) mono(mscorlib) mono(pango-sharp)"

inherit rpm
