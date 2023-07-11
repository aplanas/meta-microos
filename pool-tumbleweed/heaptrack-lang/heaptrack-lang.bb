SUMMARY = "Translations for package heaptrack"
DESCRIPTION = "Provides translations for the 'heaptrack' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "heaptrack-lang-1.4.0-4.5.noarch.rpm"
RPM_HASH = "a82722f5c7f286a6a0437eaaced8d46b3a9a211733bea4680a876572ac65005527a14a06ac3d392997d06bb76b3b22efe019819857172fc2c5bf07693bc81987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "heaptrack-lang \
heaptrack-lang-all \
locale-heaptrack-ast \
locale-heaptrack-ca \
locale-heaptrack-ca@valencia \
locale-heaptrack-cs \
locale-heaptrack-da \
locale-heaptrack-de \
locale-heaptrack-en-GB \
locale-heaptrack-es \
locale-heaptrack-fr \
locale-heaptrack-gl \
locale-heaptrack-ia \
locale-heaptrack-ko \
locale-heaptrack-nl \
locale-heaptrack-nn \
locale-heaptrack-pl \
locale-heaptrack-pt \
locale-heaptrack-pt-BR \
locale-heaptrack-ru \
locale-heaptrack-sk \
locale-heaptrack-sl \
locale-heaptrack-sv \
locale-heaptrack-tr \
locale-heaptrack-uk \
locale-heaptrack-zh-CN"

RDEPENDS:${PN} += "heaptrack"

inherit rpm
