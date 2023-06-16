SUMMARY = "Smart Unicode Font for Latin and Cyrillic Scripts"
DESCRIPTION = "Charis is similar to Bitstream Charter, one of the first fonts designed \
specifically for laser printers. It is highly readable and holds up \
well in less-than-ideal reproduction environments. It also has a full \
set of styles - regular, italic, bold, bold italic - and so is more \
useful in general publishing than Doulos SIL. Charis is a serif, \
proportionally-spaced font optimized for readability in long printed \
documents. \
 \
The goal for this product was to provide a single Unicode-based font \
family that would contain a comprehensive inventory of glyphs needed \
for almost any Roman- or Cyrillic-based writing system, whether used \
for phonetic or orthographic needs. In addition, there is provision for \
other characters and symbols useful to linguists. This font makes use \
of state-of-the-art font technologies to support complex typographic \
issues, such as the need to position arbitrary combinations of base \
glyphs and diacritics optimally."
LICENSE = "OFL-1.1"

PV = "6.200"

RPM_NAME = "sil-charis-fonts-6.200-1.1.noarch.rpm"
RPM_HASH = "ae1d4b43bd3772997a0219b92dfd120434cc7a910ebd3f18fc633b822c6d6fd7206bdb4c5019597347abf5ed574043185df5910c31426209a34052aab07d5cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vi;ru;bg \
sil-charis-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
