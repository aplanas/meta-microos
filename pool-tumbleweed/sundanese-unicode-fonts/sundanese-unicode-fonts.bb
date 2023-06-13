SUMMARY = "Sundanese Unicode Font"
DESCRIPTION = "BabelStone latin modern font."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.5"

RPM_NAME = "sundanese-unicode-fonts-1.0.5-3.17.noarch.rpm"
RPM_HASH = "bf6317f6564d4f3f25865592f74933348354c9da1177f4f022ec701448f54b405aae4ebe3e4f3e8ac2425784517036dd67b83c01361a4adb82e8d06704c11332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sundanese-unicode-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
