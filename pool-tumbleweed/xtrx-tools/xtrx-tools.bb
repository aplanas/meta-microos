SUMMARY = "Tools for XTRX"
DESCRIPTION = "Tools for XTRX SDR devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrx-tools-0.0.0+git.20201202-3.7.aarch64.rpm"
RPM_HASH = "52c50bc42bae6c873d486c037029c901aa9a955addab28ee7943b53b045eb0c98aaff647cb088c17562f65c592700dce722226ee80c904a8b6c98bb3a4b65960"

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
