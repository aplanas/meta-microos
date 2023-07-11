SUMMARY = "Quake III"
DESCRIPTION = "Quake III development tools for creating mods: q3lcc, q3rcc, q3cpp, \
q3asm"
LICENSE = "GPL-2.0-or-later"

PV = "1.36+git.20221123"

RPM_NAME = "ioquake3-devel-1.36+git.20221123-1.4.aarch64.rpm"
RPM_HASH = "3962139bd637c806548058b468b4f2a876f967287b2b009499beebb44254e10070d1fd49fd5b98f926fde86f18676e2eb394c2a68e5eb81e7185d2e518adc13a"

RPROVIDES:${PN} += "ioquake3-devel"

RDEPENDS:${PN} += ""

inherit rpm
