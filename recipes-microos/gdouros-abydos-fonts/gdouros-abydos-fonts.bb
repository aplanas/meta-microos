SUMMARY = "A data font of 7440 Egyptian hieroglyphs"
DESCRIPTION = "Font containing 7440 Egyptian hieroglyphs. \
Abydos is mainly based on Glyph for Windows version 2.0; it also covers \
proposals for encoding Egyptian Hieroglyphs in The Unicode Standard: \
  * Hans van den Berg, Eric Aubourg, “Hieroglyphic Text Processing: \
    Glyph for Windows”, CCER, 2007 \
  * Michel Suignard, “Source analysis of an extended Egyptian \
    Hieroglyphs repertoire”, L2/16-257, \
  * “New draft for the encoding of an extended Egyptian Hieroglyphs \
    repertoire”, L2/17-073"
LICENSE = "SUSE-Permissive"

PV = "1.96"

RPM_NAME = "gdouros-abydos-fonts-1.96-2.7.noarch.rpm"
RPM_HASH = "576bf8292ab90cc5b88d0923bc2cc451b46330fe906d3d45d8047c6ae454542b8c85bc84159243007cc9c147f66625d3f9960dfcb12f27e124f45820c97a161f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-abydos-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
