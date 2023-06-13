SUMMARY = "Javadoc for skinlf"
DESCRIPTION = "Skin Look And Feel allows Java developers to write skinnable application using \
the Swing toolkit. Skin Look And Feel is able to read GTK (The Gimp Toolkit) \
and KDE (The K Desktop Environment) skins to enhance your application GUI \
controls such as Buttons, Checks, Radios, Scrollbars, Progress Bar, Lists, \
Tables, Internal Frames, Colors, Background Textures, Regular Windows. Skin \
Look And Feel (aka SkinLF) also includes NativeSkin to create irregular \
windows. \
 \
This package provides the HTML-Documentation for skinlf."
LICENSE = "Apache-1.1 & Zlib"

PV = "6.7"

RPM_NAME = "skinlf-javadoc-6.7-9.2.noarch.rpm"
RPM_HASH = "310bb7e5ab2370f4d48fed4c18671c65b205b4c9469fead460e2b9799b3f2b830ef02b3e1049100135dd3609c03d15d5531e10cac8e4f6417c1e27772be28b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skinlf-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
