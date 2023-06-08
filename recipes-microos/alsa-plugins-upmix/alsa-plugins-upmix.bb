SUMMARY = "PCM Up-mix Plug-In for ALSA Library"
DESCRIPTION = "This package contains a PCM filter plugin that performs multi-channel \
upmixing for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-upmix-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "fc2bc76b1055f9ea837e6479b1ed13e683e8d97bc98e40b1ce675acb52559455867628ff8d15e8115238924d76e988e7f76cea48fdbb8e2b66f57306afd2855e"

RPROVIDES:${PN} += "alsa-plugins-upmix alsa-plugins-upmix(aarch-64) libasound_module_pcm_upmix.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
