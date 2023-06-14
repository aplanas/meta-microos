SUMMARY = "Example programs for aubio library"
DESCRIPTION = "This package includes the example programs for aubio library."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "aubio-tools-0.4.9-9.1.aarch64.rpm"
RPM_HASH = "4d076470340b34292f8fd414603bd4139bd7ee07976b76157afc35a1201a2da3dae7778bc7a49701da6b94a4b8e93f01a0fd54df3edbc47efe8c5ebf59c1a445"

RPROVIDES:${PN} += "aubio-tools"

RDEPENDS:${PN} += "libaubio.so.5 \
libc.so.6 \
libjack.so.0"

inherit rpm
