SUMMARY = "Udev rules for Mirics MRi2500 based DVB dongles"
DESCRIPTION = "Udev rules for Mirics MRi2500 based DVB dongles."
LICENSE = "GPL-2.0"

PV = "0.0.0+git.20130608"

RPM_NAME = "mirisdr-udev-0.0.0+git.20130608-1.24.aarch64.rpm"
RPM_HASH = "f3fbf66e263d5b16367b9b25359592c3a7011f86ab4805f386dcd4630eb264828c3565db2b3bcb97a1093d299f05c2223af720d15477d99f9faa9e582b6d15e5"

RPROVIDES:${PN} += "mirisdr-udev"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
