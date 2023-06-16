SUMMARY = "Greek TrueType Fonts"
DESCRIPTION = "These fonts include a complete set of Cyrillic letters and improved \
italic characters."
LICENSE = "GPL-2.0+"

PV = "1.2"

RPM_NAME = "thryomanes-fonts-1.2-179.17.noarch.rpm"
RPM_HASH = "6aee4494af0fdcb6f610ff708efcccc7f494c6c97a8833f6a76e2bec81d351aec8a469e5ffb00dc5057a1193ff78bfcfb1b3e098bc57af056c5d0cf004a15766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fonts-thryomanes \
locale-bg;el;ru \
scalable-font-bg \
scalable-font-el \
scalable-font-ru \
thryomanes-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
