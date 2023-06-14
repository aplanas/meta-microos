SUMMARY = "Kernel firmware files for various Video4Linux drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various Video4Linux drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-media-20230517-1.1.noarch.rpm"
RPM_HASH = "1fd14f44b92cc13ea8fb817cea93057eadf65171612400a7e1777bd3813da515875f8d6a4ffa3d61dd80731e5af6575e288f648f72ce93ba1241edd1b67a843e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-as102-data1-st.hex \
firmware-as102-data2-st.hex \
firmware-av7110/bootcode.bin \
firmware-cmmb-vega-12mhz.inp \
firmware-cmmb-venice-12mhz.inp \
firmware-cpia2/stv0672-vp4.bin \
firmware-dabusb/bitstream.bin \
firmware-dabusb/firmware.fw \
firmware-dvb-fe-xc4000-1.4.1.fw \
firmware-dvb-fe-xc5000-1.6.114.fw \
firmware-dvb-fe-xc5000c-4.1.30.7.fw \
firmware-dvb-nova-12mhz-b0.inp \
firmware-dvb-nova-12mhz.inp \
firmware-dvb-usb-dib0700-1.20.fw \
firmware-dvb-usb-it9135-01.fw \
firmware-dvb-usb-it9135-02.fw \
firmware-dvb-usb-terratec-h5-drxk.fw \
firmware-isdbt-nova-12mhz-b0.inp \
firmware-isdbt-nova-12mhz.inp \
firmware-isdbt-rio.inp \
firmware-lgs8g75.fw \
firmware-mediatek/mt8173/vpu-d.bin \
firmware-mediatek/mt8173/vpu-p.bin \
firmware-meson/vdec/g12a-h264.bin \
firmware-meson/vdec/g12a-hevc-mmu.bin \
firmware-meson/vdec/g12a-vp9.bin \
firmware-meson/vdec/gxbb-h264.bin \
firmware-meson/vdec/gxl-h263.bin \
firmware-meson/vdec/gxl-h264.bin \
firmware-meson/vdec/gxl-hevc-mmu.bin \
firmware-meson/vdec/gxl-hevc.bin \
firmware-meson/vdec/gxl-mjpeg.bin \
firmware-meson/vdec/gxl-mpeg12.bin \
firmware-meson/vdec/gxl-mpeg4-5.bin \
firmware-meson/vdec/gxl-vp9.bin \
firmware-meson/vdec/gxm-h264.bin \
firmware-meson/vdec/sm1-hevc-mmu.bin \
firmware-meson/vdec/sm1-vp9-mmu.bin \
firmware-qcom/venus-1.8/venus.mbn \
firmware-qcom/venus-1.8/venus.mdt \
firmware-qcom/venus-4.2/venus.mbn \
firmware-qcom/venus-4.2/venus.mdt \
firmware-qcom/venus-5.2/venus.mbn \
firmware-qcom/venus-5.2/venus.mdt \
firmware-qcom/venus-5.4/venus.mbn \
firmware-qcom/venus-5.4/venus.mdt \
firmware-qcom/vpu-1.0/venus.mbn \
firmware-qcom/vpu-1.0/venus.mdt \
firmware-qcom/vpu-2.0/venus.mbn \
firmware-s5p-mfc-v6-v2.fw \
firmware-s5p-mfc-v6.fw \
firmware-s5p-mfc-v7.fw \
firmware-s5p-mfc-v8.fw \
firmware-s5p-mfc.fw \
firmware-sms1xxx-hcw-55xxx-dvbt-02.fw \
firmware-sms1xxx-hcw-55xxx-isdbt-02.fw \
firmware-sms1xxx-nova-a-dvbt-01.fw \
firmware-sms1xxx-nova-b-dvbt-01.fw \
firmware-sms1xxx-stellar-dvbt-01.fw \
firmware-tdmb-nova-12mhz.inp \
firmware-ti/vpdma-1b8.bin \
firmware-tlg2300-firmware.bin \
firmware-ttusb-budget/dspbootcode.bin \
firmware-v4l-cx231xx-avcore-01.fw \
firmware-v4l-cx23418-apu.fw \
firmware-v4l-cx23418-cpu.fw \
firmware-v4l-cx23418-dig.fw \
firmware-v4l-cx23885-avcore-01.fw \
firmware-v4l-cx25840.fw \
firmware-vicam/firmware.fw \
firmware-vpu-d.bin \
firmware-vpu-p.bin \
kernel-firmware-media"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
