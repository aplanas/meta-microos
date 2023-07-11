SUMMARY = "Translations for package libdazzle"
DESCRIPTION = "Provides translations for the 'libdazzle' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "libdazzle-lang-3.44.0-1.8.noarch.rpm"
RPM_HASH = "1d1bc08b69cecfc41552022b3961f5f7f3de0781527206091aef7a71483fb353c98f192eed1ef8ecf18ab83f2ed88dbcacbf40ab59af082e69d5a277e59ee586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdazzle-lang \
libdazzle-lang-all \
locale-libdazzle-de \
locale-libdazzle-es \
locale-libdazzle-eu \
locale-libdazzle-pl \
locale-libdazzle-sv \
locale-libdazzle-uk \
locale-libdazzle-zh-CN"

RDEPENDS:${PN} += "libdazzle"

inherit rpm
