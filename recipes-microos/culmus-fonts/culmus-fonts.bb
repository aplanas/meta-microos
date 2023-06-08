SUMMARY = "A set of Hebrew fonts"
DESCRIPTION = "A set of 15 Hebrew font families. Those families provide a basic set \
of a serif (Frank Ruehl), sans serif (Nachlieli), and monospaced \
(Miriam Mono) fonts. ASCII glyphs are partially borrowed from the URW \
and Bitstream fonts. Also included Miriam, Drugulin, Aharoni, David, \
Yehuda, and Ellinia."
LICENSE = "GPL-2.0-or-later"

PV = "0.133"

RPM_NAME = "culmus-fonts-0.133-1.4.noarch.rpm"
RPM_HASH = "37ea49e643f52f01e7b104595682e0cbbb4db045a3e569770cab20d4b71fbb18f1aa2e8810b63909ec032b9496279bdb4a129ac9af3e14e1d18211ff49c3c89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "culmus-fonts locale(he)"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
