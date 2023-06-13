SUMMARY = "A fork of multimon that decodes multiple digital transmission modes"
DESCRIPTION = "MultimonNG a fork of multimon. It decodes the following digital transmission modes: \
* POCSAG512 POCSAG1200 POCSAG2400 \
* EAS \
* UFSK1200 CLIPFSK AFSK1200 AFSK2400 AFSK2400_2 AFSK2400_3 \
* HAPN4800 \
* FSK9600 \
* DTMF \
* ZVEI1 ZVEI2 ZVEI3 DZVEI PZVEI \
* EEA EIA CCIR \
* MORSE CW \
* FLEX"
LICENSE = "GPL-2.0-only"

PV = "1.2.0"

RPM_NAME = "multimon-ng-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "e227e1c630a7e6e18fb3f9420b7b8eeabcc9f61164d10d90bad07c6e9cc2fccafaa61707358652537c5c0c04c59309818fb41bca857d6c99ff5b1d6f64fda543"

RPROVIDES:${PN} += "multimon-ng \
multimon-ng(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
