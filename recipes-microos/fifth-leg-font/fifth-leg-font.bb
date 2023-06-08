SUMMARY = "Font for the openSUSE Brand"
DESCRIPTION = "The Fifth Leg font is the font used for openSUSE branded material."
LICENSE = "OFL-1.1"

PV = "0.6"

RPM_NAME = "fifth-leg-font-0.6-25.17.noarch.rpm"
RPM_HASH = "57aeb5ec541ad3773e13c20616127641950a35e39c23658f2988b0ab7106f3a35909ce44a14278313a9030d4a1f61370f0c3cccb942e3abb2e3ef376e88914a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fifth-leg-font"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
