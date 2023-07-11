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

RPM_NAME = "multimon-ng-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "90533d131a554ff150e182e868084bf58aab520086c9a8164c247fc694149442bbd64c254df0362ee3e7e841e8d115bcbe1c3566dbe877b4d66949bade028d8a"

RPROVIDES:${PN} += "multimon-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
