SUMMARY = "A SatCom ACARS demodulator and decoder for the Aero standard"
DESCRIPTION = "JAERO is a program that demodulates and decodes Classic Aero ACARS (Aircraft \
Communications Addressing and Reporting System) messages sent from satellites to \
aeroplanes (SatCom ACARS), commonly used when planes are beyond VHF range. \
 \
Demodulation is performed using the soundcard. \
 \
Such signals are typically around 1.5Ghz and can be received with a \
low-gain antenna that can be home-brewed in conjunction with an \
RTL-SDR dongle."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "1.0.4.13"

RPM_NAME = "jaero-1.0.4.13-1.9.aarch64.rpm"
RPM_HASH = "8d5f97fbd0fa5c6869aa2b75b5cfe1ac8dc6fe72c5c5a15b78efed209eb96458674da7eb6bd708290d6d29d620e8cf1a6d4ee450684341594f3b06eb1bd259bc"

RPROVIDES:${PN} += "jaero"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libacars.so.1 \
libc.so.6 \
libcorrect.so.0.0.0 \
libgcc-s.so.1 \
libm.so.6 \
libogg.so.0 \
libqcustomplot.so.2 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libzmq.so.5 \
unzip"

inherit rpm
