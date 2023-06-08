SUMMARY = "Colorful emoji"
DESCRIPTION = "Colorful variation of Openmoji glyphs."
LICENSE = "CC-BY-SA-4.0"

PV = "13.1.0+git.1605265744.4a80b536e"

RPM_NAME = "OpenMoji-Color-13.1.0+git.1605265744.4a80b536e-1.6.noarch.rpm"
RPM_HASH = "b3880f05efd216f0591ff48f63ee2ac17ced8f6cdbf008f7c971c9659c126addcc5cc781db7091a7acfae7b5b503d45703d1d022516becb211d32c053590a728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenMoji-Color"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
