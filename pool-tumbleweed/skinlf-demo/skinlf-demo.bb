SUMMARY = "Examples for skinlf"
DESCRIPTION = "Skin Look And Feel allows Java developers to write skinnable application using \
the Swing toolkit. Skin Look And Feel is able to read GTK (The Gimp Toolkit) \
and KDE (The K Desktop Environment) skins to enhance your application GUI \
controls such as Buttons, Checks, Radios, Scrollbars, Progress Bar, Lists, \
Tables, Internal Frames, Colors, Background Textures, Regular Windows. Skin \
Look And Feel (aka SkinLF) also includes NativeSkin to create irregular \
windows. \
 \
This package provides a few demo examples for skinlf."
LICENSE = "Apache-1.1 & Zlib"

PV = "6.7"

RPM_NAME = "skinlf-demo-6.7-9.2.noarch.rpm"
RPM_HASH = "df914802e0278b1cfad771a762d194175fa092350fec2e739bb33c60ca987ae56d4e12f3ee641d95d22170b70cd315ece174f1831a4122123001e61a14b44493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skinlf-demo"

RDEPENDS:${PN} += "/bin/bash \
skinlf"

inherit rpm
