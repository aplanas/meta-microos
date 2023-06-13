SUMMARY = "Big Chinese Fonts for the X Window System"
DESCRIPTION = "Big Chinese fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-chinese-big-bitmap-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "c01992ef1ee474526c4a42a6c19141adb771e929e9c525bc2b918bef8721e06469838671a243f0dbf97f40e542d08f587640e6ad9907208e1de543e5fdda6070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntchib \
intlfonts-chinese-big-bitmap-fonts \
locale(xorg-x11:zh)"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
