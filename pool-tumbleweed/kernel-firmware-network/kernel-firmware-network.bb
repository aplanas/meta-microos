SUMMARY = "Kernel firmware files for various network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-network-20230724-1.1.noarch.rpm"
RPM_HASH = "bd1b0b78e1035c4df68b5c1ab0a7aede5bf881dc27d75f21a7ea969f232e7c1c3caec8aed0510ad9d5735b26fce353da749047e2526ea19f26b9c0ea6a9808b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-3com/typhoon.bin \
firmware-acenic/tg1.bin \
firmware-acenic/tg2.bin \
firmware-adaptec/starfire-rx.bin \
firmware-adaptec/starfire-tx.bin \
firmware-agere-ap-fw.bin \
firmware-agere-sta-fw.bin \
firmware-atmel/wilc1000-ap-fw.bin \
firmware-atmel/wilc1000-fw.bin \
firmware-atmel/wilc1000-p2p-fw.bin \
firmware-atmel/wilc1000-wifi-firmware-1.bin \
firmware-atmel/wilc1000-wifi-firmware.bin \
firmware-e100/d101m-ucode.bin \
firmware-e100/d101s-ucode.bin \
firmware-e100/d102e-ucode.bin \
firmware-intel/ice/ddp-comms/ice-comms-1.3.40.0.pkg \
firmware-intel/ice/ddp-wireless-edge/ice-wireless-edge-1.3.10.0.pkg \
firmware-intel/ice/ddp/ice-1.3.30.0.pkg \
firmware-intel/ice/ddp/ice.pkg \
firmware-myri10ge-eth-big-z8e.dat \
firmware-myri10ge-eth-z8e.dat \
firmware-myri10ge-ethp-big-z8e.dat \
firmware-myri10ge-ethp-z8e.dat \
firmware-myri10ge-rss-eth-big-z8e.dat \
firmware-myri10ge-rss-eth-z8e.dat \
firmware-myri10ge-rss-ethp-big-z8e.dat \
firmware-myri10ge-rss-ethp-z8e.dat \
firmware-myricom/lanai.bin \
firmware-phanfw.bin \
firmware-rt2561.bin \
firmware-rt2561s.bin \
firmware-rt2661.bin \
firmware-sdd-sagrad-1091-1098.bin \
firmware-slicoss/gbdownload.sys \
firmware-slicoss/gbrcvucode.sys \
firmware-slicoss/oasisdbgdownload.sys \
firmware-slicoss/oasisdownload.sys \
firmware-slicoss/oasisrcvucode.sys \
firmware-sxg/saharadbgdownloadB.sys \
firmware-sxg/saharadownloadB.sys \
firmware-tehuti/bdx.bin \
firmware-tigon/tg3-tso.bin \
firmware-tigon/tg3-tso5.bin \
firmware-tigon/tg3.bin \
firmware-tigon/tg357766.bin \
firmware-vxge/X3fw-pxe.ncf \
firmware-vxge/X3fw.ncf \
firmware-wsm-22.bin \
kernel-firmware-network"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
