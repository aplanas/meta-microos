SUMMARY = "Pulseaudio Plug-In for ALSA Library"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the polypaudio I/O plug-in for ALSA library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-pulse-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "9e4a6d033c27ad87814df47c2e18f7238ff6da55e88121c732db234bfcac55f2147b2215f809d7e0507f4655647fa03d10e13c168e9859b8ce190b15f033b2cb"

RPROVIDES:${PN} += "alsa-plugins-pulse \
alsa-plugins-pulse(aarch-64) \
libasound_module_conf_pulse.so()(64bit) \
libasound_module_ctl_pulse.so()(64bit) \
libasound_module_pcm_pulse.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
pulseaudio-daemon"

inherit rpm
