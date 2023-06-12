SUMMARY = "Atari Running on Any Machine"
DESCRIPTION = "ARAnyM is a multiplatform virtual machine (a software layer) for \
running Atari ST/TT/Falcon TOS/GEM applications on any hardware with \
many host operating systems. The reason for writing ARAnyM is to \
provide Atari power users with faster and better machines. The ultimate \
goal is to create a new platform where TOS/GEM applications could \
continue to live forever. \
 \
Features: \
* 68040 CPU (including MMU040) \
* 68040 and 68881/2 FPU \
* 14 MB ST-RAM and up to 3824 MB (configurable) of FastRAM \
* VIDEL, Blitter, MFP, ACIA, IKBD for highest possible compatibility \
* Sound (compatible with Atari XBIOS Sound subsystem, including \
  TimerA DMA IRQ) \
* Atari floppy DD/HD for connecting floppy image or real floppy \
  drive \
* Two IDE channels for connecting disk images, hard drives, or \
  CD-ROMs \
* Extended keyboard and mouse support (including mouse wheel) \
* Direct access to host file system via BetaDOS and MiNT xfs drivers \
* Networking using ethernet emulation with a driver for MiNT-Net \
* TOS 4.04, EmuTOS, or Linux as the booting operating system \
* Runs with FreeMiNT, MagiC, and any other operating system that \
  runs also on real Atari computers \
* Native CD-ROM access (under Linux, other OS: audio CD only) without \
  scsi, ide, or other emulation"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "aranym-1.1.0-4.4.aarch64.rpm"
RPM_HASH = "60bd5c97265f41a3301b376b97d7512352c3f02e679b998b1e291747f9e3b2aa4bae031dfb3e9f7d1b84c4246cbb390afd32c677add0452bd29e9d1711006eee"

RPROVIDES:${PN} += "application() \
application(aranym-jit.desktop) \
application(aranym-mmu.desktop) \
application(aranym.desktop) \
aranym \
aranym(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpfr.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libusb-1.0.so.0()(64bit) \
libz.so.1()(64bit) \
permissions"

inherit rpm
