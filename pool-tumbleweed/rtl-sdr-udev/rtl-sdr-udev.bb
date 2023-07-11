SUMMARY = "Udev rules for RTL2832"
DESCRIPTION = "Udev rules for rtl-sdr driver"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "rtl-sdr-udev-0.6.0-2.9.aarch64.rpm"
RPM_HASH = "9635e9aa5446ab835938bd9366fd91bdacc57600ca562164b0ab2cccb8900b16728f40ba24ca0cc3cb044ce2c93dbc9fbb9daf37b51ab9fe91c90bd1248dc0c1"

RPROVIDES:${PN} += "rtl-sdr-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
