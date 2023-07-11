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

RPM_NAME = "jaero-1.0.4.13-1.10.aarch64.rpm"
RPM_HASH = "5199ce68cd5517d43af46cb1cc0c135cd533f614805fa23f5b09b8c3ecc671c00e05682b21183ad5b5063be06e19c1439d852c7cc967403bd4bd48e7c662faee"

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
