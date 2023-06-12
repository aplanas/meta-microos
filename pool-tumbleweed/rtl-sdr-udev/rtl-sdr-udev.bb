SUMMARY = "Udev rules for RTL2832"
DESCRIPTION = "Udev rules for rtl-sdr driver"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "rtl-sdr-udev-0.6.0-2.8.aarch64.rpm"
RPM_HASH = "ab65daf2858123d4354240e937c74a06e1b663e3695b4417c53e89bd54536c7f545dfa3f2ea01d730ec664e9ef977a1c3411db9aa33baa6c5cd4f54573090499"

RPROVIDES:${PN} += "rtl-sdr-udev \
rtl-sdr-udev(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
shadow"

inherit rpm
