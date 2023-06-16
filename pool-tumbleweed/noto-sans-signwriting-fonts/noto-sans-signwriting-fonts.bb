SUMMARY = "Noto Sign Writing Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SignWriting Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-signwriting-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "305ad3d470dfab1f8d6da254f46807696d600a11d471b05bdacb99490b4b4cb04ea1386c3018677372f42681d812a845caa4295861e4a1d4639590109021e3e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-signwriting \
noto-sans-signwriting-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
