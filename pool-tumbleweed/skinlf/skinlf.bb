SUMMARY = "Allows developers to write skinnable application using the Swing toolkit"
DESCRIPTION = "Skin Look And Feel allows Java developers to write skinnable application using \
the Swing toolkit. Skin Look And Feel is able to read GTK (The Gimp Toolkit) \
and KDE (The K Desktop Environment) skins to enhance your application GUI \
controls such as Buttons, Checks, Radios, Scrollbars, Progress Bar, Lists, \
Tables, Internal Frames, Colors, Background Textures, Regular Windows. Skin \
Look And Feel (aka SkinLF) also includes NativeSkin to create irregular \
windows."
LICENSE = "Apache-1.1 & Zlib"

PV = "6.7"

RPM_NAME = "skinlf-6.7-9.3.noarch.rpm"
RPM_HASH = "97dcc8217f6a87c41369da9156d805feff6162c2b7f22e97a232b398d99d43707d5fa7df890c8348b64c698574279b68381f0ba1eadfdea989f934976ab39a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skinlf"

RDEPENDS:${PN} += "java \
jpackage-utils \
laf-plugin \
xalan-j2"

inherit rpm
