SUMMARY = "Kernel firmware files for various serial drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various serial drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-serial-20230829-1.1.noarch.rpm"
RPM_HASH = "e874d56fcb4ceb7c8386bd73ebe82729595ab33c7b0d3a95bc3405a5cadc007b7d05a8ac4deb97ff066990cef718c9e6c126692784ecfc5dfb06fbac4e6ba594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-edgeport/boot.fw \
firmware-edgeport/boot2.fw \
firmware-edgeport/down.fw \
firmware-edgeport/down2.fw \
firmware-edgeport/down3.bin \
firmware-keyspan-pda/keyspan-pda.fw \
firmware-keyspan-pda/xircom-pgs.fw \
firmware-keyspan/mpr.fw \
firmware-keyspan/usa18x.fw \
firmware-keyspan/usa19.fw \
firmware-keyspan/usa19qi.fw \
firmware-keyspan/usa19qw.fw \
firmware-keyspan/usa19w.fw \
firmware-keyspan/usa28.fw \
firmware-keyspan/usa28x.fw \
firmware-keyspan/usa28xa.fw \
firmware-keyspan/usa28xb.fw \
firmware-keyspan/usa49w.fw \
firmware-keyspan/usa49wlc.fw \
firmware-moxa/moxa-1110.fw \
firmware-moxa/moxa-1130.fw \
firmware-moxa/moxa-1131.fw \
firmware-moxa/moxa-1150.fw \
firmware-moxa/moxa-1151.fw \
firmware-moxa/moxa-1250.fw \
firmware-moxa/moxa-1251.fw \
firmware-moxa/moxa-1410.fw \
firmware-moxa/moxa-1450.fw \
firmware-moxa/moxa-1451.fw \
firmware-moxa/moxa-1613.fw \
firmware-moxa/moxa-1618.fw \
firmware-moxa/moxa-1653.fw \
firmware-moxa/moxa-1658.fw \
firmware-mts-cdma.fw \
firmware-mts-edge.fw \
firmware-mts-gsm.fw \
firmware-mts-mt9234mu.fw \
firmware-mts-mt9234zba.fw \
firmware-rp2.fw \
firmware-ti-3410.fw \
firmware-ti-5052.fw \
firmware-whiteheat-loader.fw \
firmware-whiteheat.fw \
kernel-firmware-serial"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
