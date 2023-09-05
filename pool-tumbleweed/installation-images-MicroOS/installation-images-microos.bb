SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-MicroOS-17.91-1.83.aarch64.rpm"
RPM_HASH = "1897d9848a16d5242a12722e16e2e23d51fae7c1863f8358a9e209e2234e306b20254e4e681cefedb7452b46716c25bca63cc3caa5338ce82a9d72d372a369f1"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
