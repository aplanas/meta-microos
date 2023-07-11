SUMMARY = "Configuration for autoloading extra joycond modules"
DESCRIPTION = "Configuration files to autoload optional kernel modules during \
system startup. These provide the joycond the possibility of \
signaling controller status by flashing its LEDs."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.0+git.51~f9a6691"

RPM_NAME = "joycond-autoload-0.1.0+git.51~f9a6691-3.7.noarch.rpm"
RPM_HASH = "7b5b5e6d2c61123713767b822a345b526e0105caa6bb6d3638b308eb8ae753dfb2a193f148750deb0326ce702a64509423570f0fe6631eb620ebe8aff2ab70ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joycond-autoload"

RDEPENDS:${PN} += "joycond"

inherit rpm
