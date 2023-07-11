SUMMARY = "PDF Reader"
DESCRIPTION = "EFL and python based pdf reader."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.1"

RPM_NAME = "lekha-0.2.1-1.8.aarch64.rpm"
RPM_HASH = "84a897673a6c02c6ac63fa448146e605b518902625b39b4081be0f0cd3cce855a41788179339036074bfbe9fc69d066bb45d82cda2bf8e2feff2e1b4c87ffdb9"

RPROVIDES:${PN} += "lekha \
python3.11dist-lekha \
python3dist-lekha"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyPDF2 \
python3-efl \
python3-xdg"

inherit rpm
