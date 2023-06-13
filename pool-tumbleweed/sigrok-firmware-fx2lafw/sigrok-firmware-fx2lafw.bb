SUMMARY = "Firmware for Logic Analyzers based on the Cypress EZ-USB FX2(LP) Chip"
DESCRIPTION = "fx2lafw is a free/libre/open-source firmware for logic analyzers based on \
the Cypress EZ-USB FX2(LP) chip."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.7"

RPM_NAME = "sigrok-firmware-fx2lafw-0.1.7-1.11.noarch.rpm"
RPM_HASH = "e7447eb602d772499018c247bca8e9a262c0e75b7aadde5a3f341578cb0dac0d218ddc2ba467ef5c14eb82fb18f01d0dfd67ecfbfe4e73beca4409f4b44d78c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sigrok-firmware-fx2lafw"

RDEPENDS:${PN} += ""

inherit rpm
