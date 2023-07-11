SUMMARY = "Tools for XTRX"
DESCRIPTION = "Tools for XTRX SDR devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrx-tools-0.0.0+git.20201202-3.8.aarch64.rpm"
RPM_HASH = "625d39fd0ef7d435e82943427e35cb9aa80e78fc074fb2b55f27645eba3287bc23be8ffc4a6863548cd0de51c5ba2809443958c34fddf13d9d5fe252d1de5f41"

RPROVIDES:${PN} += "xtrx-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqcustomplot.so.2 \
libstdc++.so.6 \
libxtrx.so.0 \
soapysdr0.8-module-xtrx"

inherit rpm
