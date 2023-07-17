SUMMARY = "Kernel firmware files for various platform drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various platform drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-platform-20230707-1.1.noarch.rpm"
RPM_HASH = "e95791c0b6acf3f5ccf80e10542cd18665bd8776e5e326682c6751699c632bcf1a7c2fe26f70f428c859e306aca74dee429c3aec54f7c07668200a2c49157389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-advansys/3550.bin \
firmware-advansys/38C0800.bin \
firmware-advansys/38C1600.bin \
firmware-advansys/mcode.bin \
firmware-amd/amd-sev-fam17h-model0xh.sbin \
firmware-amd/amd-sev-fam17h-model3xh.sbin \
firmware-amd/amd-sev-fam19h-model0xh.sbin \
firmware-amphion/vpu/vpu-fw-imx8-dec.bin \
firmware-amphion/vpu/vpu-fw-imx8-enc.bin \
firmware-ast-dp501-fw.bin \
firmware-cadence/mhdp8546.bin \
firmware-cavium/cnn55xx-ae.fw \
firmware-cavium/cnn55xx-se.fw \
firmware-cis/3CCFEM556.cis \
firmware-cis/3CXEM556.cis \
firmware-cis/COMpad2.cis \
firmware-cis/COMpad4.cis \
firmware-cis/DP83903.cis \
firmware-cis/LA-PCM.cis \
firmware-cis/MT5634ZLX.cis \
firmware-cis/NE2K.cis \
firmware-cis/PCMLM28.cis \
firmware-cis/PE-200.cis \
firmware-cis/PE520.cis \
firmware-cis/RS-COM-2P.cis \
firmware-cis/SW-555-SER.cis \
firmware-cis/SW-7xx-SER.cis \
firmware-cis/SW-8xx-SER.cis \
firmware-cis/tamarack.cis \
firmware-cnm/wave521c-k3-codec-fw.bin \
firmware-dsp56k/bootstrap.bin \
firmware-ene-ub6250/ms-init.bin \
firmware-ene-ub6250/ms-rdwr.bin \
firmware-ene-ub6250/msp-rdwr.bin \
firmware-ene-ub6250/sd-init1.bin \
firmware-ene-ub6250/sd-init2.bin \
firmware-ene-ub6250/sd-rdwr.bin \
firmware-f2255usb.bin \
firmware-go7007/go7007fw.bin \
firmware-go7007/go7007tv.bin \
firmware-go7007/lr192.fw \
firmware-go7007/px-m402u.fw \
firmware-go7007/px-tv402u.fw \
firmware-go7007/s2250-1.fw \
firmware-go7007/s2250-2.fw \
firmware-go7007/wis-startrek.fw \
firmware-imx/sdma/sdma-imx6q.bin \
firmware-imx/sdma/sdma-imx7d.bin \
firmware-inside-secure/eip197-minifw/ifpp.bin \
firmware-inside-secure/eip197-minifw/ipue.bin \
firmware-lt9611uxc-fw.bin \
firmware-matrox/g200-warp.fw \
firmware-matrox/g400-warp.fw \
firmware-microchip/mscc-vsc8574-revb-int8051-29e8.bin \
firmware-microchip/mscc-vsc8584-revb-int8051-fb48.bin \
firmware-mrvl/cpt01/ae.out \
firmware-mrvl/cpt01/ie.out \
firmware-mrvl/cpt01/se.out \
firmware-mrvl/cpt02/ae.out \
firmware-mrvl/cpt02/ie.out \
firmware-mrvl/cpt02/se.out \
firmware-mrvl/cpt03/ae.out \
firmware-mrvl/cpt03/ie.out \
firmware-mrvl/cpt03/se.out \
firmware-mrvl/cpt04/ae.out \
firmware-mrvl/cpt04/ie.out \
firmware-mrvl/cpt04/se.out \
firmware-nxp/helper-uart-3000000.bin \
firmware-nxp/sr150-fw.bin \
firmware-nxp/uartiw416-bt-v0.bin \
firmware-nxp/uartspi-n61x-v1.bin.se \
firmware-nxp/uartuart8987-bt.bin \
firmware-nxp/uartuart8997-bt-v4.bin \
firmware-nxp/uartuart9098-bt-v1.bin \
firmware-ositech/Xilinx7OD.bin \
firmware-r128/r128-cce.bin \
firmware-r8a779x-usb3-v1.dlmem \
firmware-r8a779x-usb3-v2.dlmem \
firmware-r8a779x-usb3-v3.dlmem \
firmware-rockchip/dptx.bin \
firmware-s2250-loader.fw \
firmware-s2250.fw \
firmware-sun/cassini.bin \
firmware-usbdux-firmware.bin \
firmware-usbduxfast-firmware.bin \
firmware-usbduxsigma-firmware.bin \
firmware-wfx/brd4001a.pds \
firmware-wfx/brd8022a.pds \
firmware-wfx/brd8023a.pds \
firmware-wfx/wfm-wf200-C0.sec \
firmware-yam/1200.bin \
firmware-yam/9600.bin \
kernel-firmware-platform"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
