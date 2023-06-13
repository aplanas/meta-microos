SUMMARY = "Manchu Unicode Fonts"
DESCRIPTION = "Font for the Manchu script"
LICENSE = "OFL-1.1 & GFDL-1.2+"

PV = "2.007+svn77"

RPM_NAME = "manchu-fonts-2.007+svn77-1.15.noarch.rpm"
RPM_HASH = "7d5bfed49ba25fa437280a86e7c6b743b8d496a1bbd11e3ed31ab1156ef9389f61e93f43900a22fa5ae8a12121fe913f026c894560068a7b1e2767d5811160d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "manchu-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
