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

RPM_NAME = "skinlf-javadoc-6.7-9.3.noarch.rpm"
RPM_HASH = "30ccb4952ebbd43931332c90e8a3d820ab6ff3f9c9b1600c1e377c343203e7b842700fa7e2b695280b7cef005a8bb31e3422cf769b922d81686ae8cfcf19c431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skinlf-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
