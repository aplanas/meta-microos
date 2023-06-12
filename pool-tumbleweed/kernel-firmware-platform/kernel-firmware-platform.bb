SUMMARY = "Kernel firmware files for various platform drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various platform drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-platform-20230517-1.1.noarch.rpm"
RPM_HASH = "e41424fa97113fd064ee961520a8f9395468694b264acfbb4735fa422c628d8386b1165c68446ef193805c1d9a91eb93d44279b774f8c80acc604ceec6cf7076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(advansys/3550.bin) \
firmware(advansys/38C0800.bin) \
firmware(advansys/38C1600.bin) \
firmware(advansys/mcode.bin) \
firmware(amd/amd_sev_fam17h_model0xh.sbin) \
firmware(amd/amd_sev_fam17h_model3xh.sbin) \
firmware(amd/amd_sev_fam19h_model0xh.sbin) \
firmware(amphion/vpu/vpu_fw_imx8_dec.bin) \
firmware(amphion/vpu/vpu_fw_imx8_enc.bin) \
firmware(ast_dp501_fw.bin) \
firmware(cadence/mhdp8546.bin) \
firmware(cavium/cnn55xx_ae.fw) \
firmware(cavium/cnn55xx_se.fw) \
firmware(cis/3CCFEM556.cis) \
firmware(cis/3CXEM556.cis) \
firmware(cis/COMpad2.cis) \
firmware(cis/COMpad4.cis) \
firmware(cis/DP83903.cis) \
firmware(cis/LA-PCM.cis) \
firmware(cis/MT5634ZLX.cis) \
firmware(cis/NE2K.cis) \
firmware(cis/PCMLM28.cis) \
firmware(cis/PE-200.cis) \
firmware(cis/PE520.cis) \
firmware(cis/RS-COM-2P.cis) \
firmware(cis/SW_555_SER.cis) \
firmware(cis/SW_7xx_SER.cis) \
firmware(cis/SW_8xx_SER.cis) \
firmware(cis/tamarack.cis) \
firmware(cnm/wave521c_k3_codec_fw.bin) \
firmware(dsp56k/bootstrap.bin) \
firmware(ene-ub6250/ms_init.bin) \
firmware(ene-ub6250/ms_rdwr.bin) \
firmware(ene-ub6250/msp_rdwr.bin) \
firmware(ene-ub6250/sd_init1.bin) \
firmware(ene-ub6250/sd_init2.bin) \
firmware(ene-ub6250/sd_rdwr.bin) \
firmware(f2255usb.bin) \
firmware(go7007/go7007fw.bin) \
firmware(go7007/go7007tv.bin) \
firmware(go7007/lr192.fw) \
firmware(go7007/px-m402u.fw) \
firmware(go7007/px-tv402u.fw) \
firmware(go7007/s2250-1.fw) \
firmware(go7007/s2250-2.fw) \
firmware(go7007/wis-startrek.fw) \
firmware(imx/sdma/sdma-imx6q.bin) \
firmware(imx/sdma/sdma-imx7d.bin) \
firmware(inside-secure/eip197_minifw/ifpp.bin) \
firmware(inside-secure/eip197_minifw/ipue.bin) \
firmware(lt9611uxc_fw.bin) \
firmware(matrox/g200_warp.fw) \
firmware(matrox/g400_warp.fw) \
firmware(microchip/mscc_vsc8574_revb_int8051_29e8.bin) \
firmware(microchip/mscc_vsc8584_revb_int8051_fb48.bin) \
firmware(mrvl/cpt01/ae.out) \
firmware(mrvl/cpt01/ie.out) \
firmware(mrvl/cpt01/se.out) \
firmware(mrvl/cpt02/ae.out) \
firmware(mrvl/cpt02/ie.out) \
firmware(mrvl/cpt02/se.out) \
firmware(mrvl/cpt03/ae.out) \
firmware(mrvl/cpt03/ie.out) \
firmware(mrvl/cpt03/se.out) \
firmware(mrvl/cpt04/ae.out) \
firmware(mrvl/cpt04/ie.out) \
firmware(mrvl/cpt04/se.out) \
firmware(nxp/helper_uart_3000000.bin) \
firmware(nxp/sr150_fw.bin) \
firmware(nxp/uartiw416_bt_v0.bin) \
firmware(nxp/uartspi_n61x_v1.bin.se) \
firmware(nxp/uartuart8987_bt.bin) \
firmware(nxp/uartuart8997_bt_v4.bin) \
firmware(nxp/uartuart9098_bt_v1.bin) \
firmware(ositech/Xilinx7OD.bin) \
firmware(r128/r128_cce.bin) \
firmware(r8a779x_usb3_v1.dlmem) \
firmware(r8a779x_usb3_v2.dlmem) \
firmware(r8a779x_usb3_v3.dlmem) \
firmware(rockchip/dptx.bin) \
firmware(s2250.fw) \
firmware(s2250_loader.fw) \
firmware(sun/cassini.bin) \
firmware(usbdux_firmware.bin) \
firmware(usbduxfast_firmware.bin) \
firmware(usbduxsigma_firmware.bin) \
firmware(wfx/brd4001a.pds) \
firmware(wfx/brd8022a.pds) \
firmware(wfx/brd8023a.pds) \
firmware(wfx/wfm_wf200_C0.sec) \
firmware(yam/1200.bin) \
firmware(yam/9600.bin) \
kernel-firmware-platform"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm