SUMMARY = "UHD udev rules"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains udev rules for UHD."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "uhd-udev-4.4.0.0-1.4.aarch64.rpm"
RPM_HASH = "ce37c8ae13564ba18bbf337e1e5d86797f7983f936d689af8e431a58886bd950e236707fd9466fad8c6c0753efba08a6eef0ceaa1259541278638793a670d416"

RPROVIDES:${PN} += "uhd-udev"

RDEPENDS:${PN} += ""

inherit rpm
