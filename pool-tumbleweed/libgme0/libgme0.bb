SUMMARY = "Collection of video game music file emulators"
DESCRIPTION = "Game_Music_Emu is a collection of video game music file emulators that support \
the following formats and systems: \
- AY: ZX Spectrum/Amstrad CPC \
- GBS: Nintendo Game Boy \
- GYM: Sega Genesis/Mega Drive \
- HES: NEC TurboGrafx-16/PC Engine \
- KSS: MSX Home Computer/other Z80 systems (doesn't support FM sound) \
- NSF/NSFE: Nintendo NES/Famicom (with VRC 6, Namco 106, and FME-7 sound) \
- SAP: Atari systems using POKEY sound chip \
- SPC: Super Nintendo/Super Famicom \
- VGM/VGZ: Sega Master System/Mark III, Sega Genesis/Mega Drive,BBC Micro"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.3"

RPM_NAME = "libgme0-0.6.3-2.5.aarch64.rpm"
RPM_HASH = "a0695ae93633c1f762631cc787414b24fcc754e80dc062068e4d56cc04b69f88b5577b9c2fa3c1bde802197f672a7297c3703575246de9364bd5edf3dd3d431b"

RPROVIDES:${PN} += "libgme.so.0 \
libgme0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libubsan.so.1"

inherit rpm
