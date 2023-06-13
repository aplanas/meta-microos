SUMMARY = "Translations for package kopeninghours"
DESCRIPTION = "Provides translations for the 'kopeninghours' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kopeninghours-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "0d52f0cd66c38ddf46fb79de84e79cb827fafa1209394fde12b024e69455f32afa921c7b2e746bfdf3e5116863d0063848a520ba3c4af85ea7cd43a1b9cac371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kopeninghours-lang \
kopeninghours-lang-all \
locale(kopeninghours:ca) \
locale(kopeninghours:ca@valencia) \
locale(kopeninghours:cs) \
locale(kopeninghours:de) \
locale(kopeninghours:en_GB) \
locale(kopeninghours:es) \
locale(kopeninghours:eu) \
locale(kopeninghours:fi) \
locale(kopeninghours:fr) \
locale(kopeninghours:gl) \
locale(kopeninghours:hi) \
locale(kopeninghours:it) \
locale(kopeninghours:ja) \
locale(kopeninghours:ka) \
locale(kopeninghours:ko) \
locale(kopeninghours:lt) \
locale(kopeninghours:nl) \
locale(kopeninghours:nn) \
locale(kopeninghours:pl) \
locale(kopeninghours:pt) \
locale(kopeninghours:pt_BR) \
locale(kopeninghours:ro) \
locale(kopeninghours:ru) \
locale(kopeninghours:sk) \
locale(kopeninghours:sl) \
locale(kopeninghours:sv) \
locale(kopeninghours:tr) \
locale(kopeninghours:uk) \
locale(kopeninghours:zh_CN) \
locale(kopeninghours:zh_TW)"

RDEPENDS:${PN} += "kopeninghours"

inherit rpm
