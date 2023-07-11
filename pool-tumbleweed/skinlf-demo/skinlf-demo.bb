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

RPM_NAME = "skinlf-demo-6.7-9.3.noarch.rpm"
RPM_HASH = "ec9cc8a3720507c6ffebcb4e177383613b2ab5af877264c86db2eb2723a030fde05b237fd13d7b6f002e2fae77713b4278fe04851239b3019c41c6a9f10bb54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skinlf-demo"

RDEPENDS:${PN} += "/usr/bin/bash \
skinlf"

inherit rpm
