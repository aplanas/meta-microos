SUMMARY = "Mist Theme for GTK+ 2"
DESCRIPTION = "This package provides the Mist GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-mist-2.20.2-19.43.noarch.rpm"
RPM_HASH = "66643c6fe15faab8795dc9b94f3f836651c0e8a144141883503385ccbedfdc10f5991c46a7565274f2ff8a563d5b477663b841a670119f5b46624c784ae830e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-mist"

RDEPENDS:${PN} += "gtk2-engine-mist"

inherit rpm
