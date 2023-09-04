SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-MicroOS-17.91-1.66.aarch64.rpm"
RPM_HASH = "9a1b45b1d6c547f11fdb1bcc2db148fb7257c7a66d09d2d412bb5d68e618be51c5e64c8e527a3d1b5707204a8df356cd11e5d8875820e96848683396a93630ca"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
