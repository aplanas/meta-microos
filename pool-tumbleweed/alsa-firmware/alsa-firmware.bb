SUMMARY = "Firmware Data Files for ALSA"
DESCRIPTION = "Various firmware data files for ALSA drivers."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "alsa-firmware-1.2.4-4.4.noarch.rpm"
RPM_HASH = "b0506b33ac3d8284e5513577f50c4a695a721c4100b37cbf870bb6aa1293f78d9842ff658e5e0f7ad076151d4b9270252c02ae323461afcd8cbf0d078c7d17f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-firmware \
firmware(aica_firmware.bin) \
firmware(asihpi/dsp5000.bin) \
firmware(asihpi/dsp6200.bin) \
firmware(asihpi/dsp6205.bin) \
firmware(asihpi/dsp6400.bin) \
firmware(asihpi/dsp6600.bin) \
firmware(asihpi/dsp8700.bin) \
firmware(asihpi/dsp8900.bin) \
firmware(cs46xx/ba1) \
firmware(cs46xx/cwc4630) \
firmware(cs46xx/cwcasync) \
firmware(cs46xx/cwcbinhack) \
firmware(cs46xx/cwcdma) \
firmware(cs46xx/cwcsnoop) \
firmware(ctefx-desktop.bin) \
firmware(ctefx-r3di.bin) \
firmware(digiface_firmware.bin) \
firmware(digiface_firmware_rev11.bin) \
firmware(ea/3g_asic.fw) \
firmware(ea/darla20_dsp.fw) \
firmware(ea/darla24_dsp.fw) \
firmware(ea/echo3g_dsp.fw) \
firmware(ea/gina20_dsp.fw) \
firmware(ea/gina24_301_asic.fw) \
firmware(ea/gina24_301_dsp.fw) \
firmware(ea/gina24_361_asic.fw) \
firmware(ea/gina24_361_dsp.fw) \
firmware(ea/indigo_dj_dsp.fw) \
firmware(ea/indigo_djx_dsp.fw) \
firmware(ea/indigo_dsp.fw) \
firmware(ea/indigo_io_dsp.fw) \
firmware(ea/indigo_iox_dsp.fw) \
firmware(ea/layla20_asic.fw) \
firmware(ea/layla20_dsp.fw) \
firmware(ea/layla24_1_asic.fw) \
firmware(ea/layla24_2A_asic.fw) \
firmware(ea/layla24_2S_asic.fw) \
firmware(ea/layla24_dsp.fw) \
firmware(ea/loader_dsp.fw) \
firmware(ea/mia_dsp.fw) \
firmware(ea/mona_2_asic.fw) \
firmware(ea/mona_301_1_asic_48.fw) \
firmware(ea/mona_301_1_asic_96.fw) \
firmware(ea/mona_301_dsp.fw) \
firmware(ea/mona_361_1_asic_48.fw) \
firmware(ea/mona_361_1_asic_96.fw) \
firmware(ea/mona_361_dsp.fw) \
firmware(emu/audio_dock.fw) \
firmware(emu/emu0404.fw) \
firmware(emu/emu1010_notebook.fw) \
firmware(emu/emu1010b.fw) \
firmware(emu/hana.fw) \
firmware(emu/micro_dock.fw) \
firmware(mixart/miXart8.elf) \
firmware(mixart/miXart8.xlx) \
firmware(mixart/miXart8AES.xlx) \
firmware(multiface_firmware.bin) \
firmware(multiface_firmware_rev11.bin) \
firmware(pcxhr/b321_512.b56) \
firmware(pcxhr/d321_512.d56) \
firmware(pcxhr/dspb1222e.b56) \
firmware(pcxhr/dspb1222hr.b56) \
firmware(pcxhr/dspb882e.b56) \
firmware(pcxhr/dspb882hr.b56) \
firmware(pcxhr/dspb924.b56) \
firmware(pcxhr/dspd1222.d56) \
firmware(pcxhr/dspd222.d56) \
firmware(pcxhr/dspd882.d56) \
firmware(pcxhr/dspe882.e56) \
firmware(pcxhr/dspe924.e56) \
firmware(pcxhr/e321_512.e56) \
firmware(pcxhr/xc_1_882.dat) \
firmware(pcxhr/xi_1_882.dat) \
firmware(pcxhr/xlxc1222e.dat) \
firmware(pcxhr/xlxc1222hr.dat) \
firmware(pcxhr/xlxc222.dat) \
firmware(pcxhr/xlxc882e.dat) \
firmware(pcxhr/xlxc882hr.dat) \
firmware(pcxhr/xlxc924.dat) \
firmware(pcxhr/xlxint.dat) \
firmware(rpm_firmware.bin) \
firmware(vx/bd56002.boot) \
firmware(vx/bd563s3.boot) \
firmware(vx/bd563v2.boot) \
firmware(vx/bx_1_vp4.b56) \
firmware(vx/bx_1_vxp.b56) \
firmware(vx/l_1_v22.d56) \
firmware(vx/l_1_vp4.d56) \
firmware(vx/l_1_vx2.d56) \
firmware(vx/l_1_vxp.d56) \
firmware(vx/x1_1_vp4.xlx) \
firmware(vx/x1_1_vx2.xlx) \
firmware(vx/x1_1_vxp.xlx) \
firmware(vx/x1_2_v22.xlx)"

RDEPENDS:${PN} += "alsa"

inherit rpm
