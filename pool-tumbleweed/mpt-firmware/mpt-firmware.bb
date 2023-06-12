SUMMARY = "Configuration files for autoloading mptctl at boot time"
DESCRIPTION = "This package contains modprobe configuration files to autoload the \
mptctl ioctl driver at boot time. The mptctl driver is an ioctl \
character driver for the LSI Logic Fusion-MPT Host adapter series. \
These adapters include \
 \
- Ultra320 53C1030, 53C1020 \
 \
- Fiber Channel FC909, FC919, FC929, FC919X and FC929X \
 \
- SAS SAS1064, and SAS1068"
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "mpt-firmware-1.0-261.16.noarch.rpm"
RPM_HASH = "6efedea95ad4b9dd95e3eea109170dfab628d648db1df034662556b85ff24f15deabecdcd156f657f9e8e10d2cb6fc026353b15fb0cf467aa4b80e33f4466e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpt-firmware"
RDEPENDS:${PN} += "modutils"

inherit rpm
