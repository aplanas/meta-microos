SUMMARY = "Simple On-screen Keyboard"
DESCRIPTION = "Language model files for the word suggestion feature of Onboard"
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "onboard-data-1.4.1-7.7.noarch.rpm"
RPM_HASH = "eef4294dbeff54c40830c19963a8f5ef50261a72d702e9f689477af5baff869cdb1dfefc4aa17543e27807941896c163ebabf1a1496c9bff79ecda0c8876af1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "onboard-data"

RDEPENDS:${PN} += "onboard"

inherit rpm
