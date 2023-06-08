SUMMARY = "Serif family for text. Variable Open Source Font"
DESCRIPTION = "Lora is a well-balanced contemporary serif with roots in calligraphy. It is \
a text typeface with moderate contrast well suited for body text. A paragraph \
set in Lora will make a memorable appearance because of its brushed curves \
in contrast with driving serifs. The overall typographic voice of Lora perfectly \
conveys the mood of a modern-day story, or an art essay. \
 \
Technically Lora is optimised for screen appearance, and works equally well in \
print. \
 \
Designed by Olga Karpushina, and Alexei Vanyashin for Cyreal."
LICENSE = "OFL-1.1"

PV = "3.005"

RPM_NAME = "cyreal-lora-fonts-3.005-1.1.noarch.rpm"
RPM_HASH = "b87180ecb6ff874e20ec332baccb79b58b77d8a7fab8a539615b732c9c5500b894022bf7f26f2c5d60ee8fdb45a2a3dbcbf35eb90d1d0a540b45f14319d54023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-lora-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
