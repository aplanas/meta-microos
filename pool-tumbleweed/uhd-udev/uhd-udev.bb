SUMMARY = "UHD udev rules"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains udev rules for UHD."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "uhd-udev-4.4.0.0-1.5.aarch64.rpm"
RPM_HASH = "75bda779f59ac05d98fcb5029c1321696b657fd8773bdeb206901f7a095d1ea2412be8ff45d71b7ae080f68bf279e6cd6c699314498a5fdc16e324e8d246101b"

RPROVIDES:${PN} += "uhd-udev"

RDEPENDS:${PN} += ""

inherit rpm
