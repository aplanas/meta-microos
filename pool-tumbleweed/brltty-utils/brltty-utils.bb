SUMMARY = "Braille display driver for Linux/Unix"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contain various utilities related to BRLTTY."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-utils-6.6-1.1.aarch64.rpm"
RPM_HASH = "8d4a70b3cdcb436a31a1e4fe9e6f7df1b1317dca5bc4edea5aa53d21da514f3adc41e9a6d127cc3df09f75a742b297c9f64ba154029a21e54121922ddead16b4"

RPROVIDES:${PN} += "brltty-utils"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
