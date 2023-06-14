SUMMARY = "Configuration for autoloading extra joycond modules"
DESCRIPTION = "Configuration files to autoload optional kernel modules during \
system startup. These provide the joycond the possibility of \
signaling controller status by flashing its LEDs."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.0+git.51~f9a6691"

RPM_NAME = "joycond-autoload-0.1.0+git.51~f9a6691-3.6.noarch.rpm"
RPM_HASH = "f413b81ed0928171451495596bac79f16ee24eb0ccbe7ef1c420f6c3211bd6d8dc3e1aeea90002c43cdca26b2f5bd6364b9003815f9e439f1e864ce9e070cafa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joycond-autoload"

RDEPENDS:${PN} += "joycond"

inherit rpm
