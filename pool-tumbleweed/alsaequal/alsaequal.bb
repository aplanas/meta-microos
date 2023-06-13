SUMMARY = "Equalizer plugin for ALSA"
DESCRIPTION = "Alsaequal is a real-time adjustable equalizer plugin for ALSA"
LICENSE = "LGPL-2.1-only"

PV = "0.7.1"

RPM_NAME = "alsaequal-0.7.1-2.10.aarch64.rpm"
RPM_HASH = "3b3d4b2e35da90f4c52ada344600740b40b175626262788d54c0fd700f77a2d384575135f2f08ad0f892a61ccd723f34c7f45f92f4868ecdb05ddc9f1a77896f"

RPROVIDES:${PN} += "alsaequal \
alsaequal(aarch-64) \
config(alsaequal) \
libasound_module_ctl_equal.so()(64bit) \
libasound_module_pcm_equal.so()(64bit)"

RDEPENDS:${PN} += "ladspa-caps \
libc.so.6()(64bit)"

inherit rpm
