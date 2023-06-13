SUMMARY = "Docs for pdnsd"
DESCRIPTION = "This package provides various text files for pdnsd."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.9a"

RPM_NAME = "pdnsd-doc-1.2.9a-10.8.noarch.rpm"
RPM_HASH = "dc66fb23821aa26e6608fdb0021df1dd049f524d1cc450fcc8c69f533e20986e87aa8c51f91bf44e760fbe87ba0628ec60daf446067177de2f64826d83a18d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdnsd-doc"

RDEPENDS:${PN} += "pdnsd"

inherit rpm
