SUMMARY = "Firmware Data Files for ALSA"
DESCRIPTION = "Various firmware data files for ALSA drivers."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "alsa-firmware-1.2.4-4.4.noarch.rpm"
RPM_HASH = "b0506b33ac3d8284e5513577f50c4a695a721c4100b37cbf870bb6aa1293f78d9842ff658e5e0f7ad076151d4b9270252c02ae323461afcd8cbf0d078c7d17f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-firmware \
firmware-aica-firmware.bin \
firmware-asihpi/dsp5000.bin \
firmware-asihpi/dsp6200.bin \
firmware-asihpi/dsp6205.bin \
firmware-asihpi/dsp6400.bin \
firmware-asihpi/dsp6600.bin \
firmware-asihpi/dsp8700.bin \
firmware-asihpi/dsp8900.bin \
firmware-cs46xx/ba1 \
firmware-cs46xx/cwc4630 \
firmware-cs46xx/cwcasync \
firmware-cs46xx/cwcbinhack \
firmware-cs46xx/cwcdma \
firmware-cs46xx/cwcsnoop \
firmware-ctefx-desktop.bin \
firmware-ctefx-r3di.bin \
firmware-digiface-firmware-rev11.bin \
firmware-digiface-firmware.bin \
firmware-ea/3g-asic.fw \
firmware-ea/darla20-dsp.fw \
firmware-ea/darla24-dsp.fw \
firmware-ea/echo3g-dsp.fw \
firmware-ea/gina20-dsp.fw \
firmware-ea/gina24-301-asic.fw \
firmware-ea/gina24-301-dsp.fw \
firmware-ea/gina24-361-asic.fw \
firmware-ea/gina24-361-dsp.fw \
firmware-ea/indigo-dj-dsp.fw \
firmware-ea/indigo-djx-dsp.fw \
firmware-ea/indigo-dsp.fw \
firmware-ea/indigo-io-dsp.fw \
firmware-ea/indigo-iox-dsp.fw \
firmware-ea/layla20-asic.fw \
firmware-ea/layla20-dsp.fw \
firmware-ea/layla24-1-asic.fw \
firmware-ea/layla24-2A-asic.fw \
firmware-ea/layla24-2S-asic.fw \
firmware-ea/layla24-dsp.fw \
firmware-ea/loader-dsp.fw \
firmware-ea/mia-dsp.fw \
firmware-ea/mona-2-asic.fw \
firmware-ea/mona-301-1-asic-48.fw \
firmware-ea/mona-301-1-asic-96.fw \
firmware-ea/mona-301-dsp.fw \
firmware-ea/mona-361-1-asic-48.fw \
firmware-ea/mona-361-1-asic-96.fw \
firmware-ea/mona-361-dsp.fw \
firmware-emu/audio-dock.fw \
firmware-emu/emu0404.fw \
firmware-emu/emu1010-notebook.fw \
firmware-emu/emu1010b.fw \
firmware-emu/hana.fw \
firmware-emu/micro-dock.fw \
firmware-mixart/miXart8.elf \
firmware-mixart/miXart8.xlx \
firmware-mixart/miXart8AES.xlx \
firmware-multiface-firmware-rev11.bin \
firmware-multiface-firmware.bin \
firmware-pcxhr/b321-512.b56 \
firmware-pcxhr/d321-512.d56 \
firmware-pcxhr/dspb1222e.b56 \
firmware-pcxhr/dspb1222hr.b56 \
firmware-pcxhr/dspb882e.b56 \
firmware-pcxhr/dspb882hr.b56 \
firmware-pcxhr/dspb924.b56 \
firmware-pcxhr/dspd1222.d56 \
firmware-pcxhr/dspd222.d56 \
firmware-pcxhr/dspd882.d56 \
firmware-pcxhr/dspe882.e56 \
firmware-pcxhr/dspe924.e56 \
firmware-pcxhr/e321-512.e56 \
firmware-pcxhr/xc-1-882.dat \
firmware-pcxhr/xi-1-882.dat \
firmware-pcxhr/xlxc1222e.dat \
firmware-pcxhr/xlxc1222hr.dat \
firmware-pcxhr/xlxc222.dat \
firmware-pcxhr/xlxc882e.dat \
firmware-pcxhr/xlxc882hr.dat \
firmware-pcxhr/xlxc924.dat \
firmware-pcxhr/xlxint.dat \
firmware-rpm-firmware.bin \
firmware-vx/bd56002.boot \
firmware-vx/bd563s3.boot \
firmware-vx/bd563v2.boot \
firmware-vx/bx-1-vp4.b56 \
firmware-vx/bx-1-vxp.b56 \
firmware-vx/l-1-v22.d56 \
firmware-vx/l-1-vp4.d56 \
firmware-vx/l-1-vx2.d56 \
firmware-vx/l-1-vxp.d56 \
firmware-vx/x1-1-vp4.xlx \
firmware-vx/x1-1-vx2.xlx \
firmware-vx/x1-1-vxp.xlx \
firmware-vx/x1-2-v22.xlx"

RDEPENDS:${PN} += "alsa"

inherit rpm
