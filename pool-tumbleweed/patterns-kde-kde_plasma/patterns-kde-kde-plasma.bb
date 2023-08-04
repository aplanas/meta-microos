SUMMARY = "KDE Plasma 5 Desktop Base"
DESCRIPTION = "Base packages for the KDE Plasma 5 desktop environment."
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_plasma-20230801-1.1.noarch.rpm"
RPM_HASH = "e17740920a7a80198fbb902d4cf2c7643b6810af2afc008ed2a4d6c9001a59cfdff5a4802775d94e318cf2efc07a9a4ec2c147d90ac305f3ef4bc318780389fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-kde-plasma \
patterns-openSUSE-kde-plasma \
patterns-openSUSE-kde4-basis \
patterns-openSUSE-plasma5-basis"

RDEPENDS:${PN} += "breeze5-cursors \
breeze5-decoration \
breeze5-icons \
breeze5-style \
desktop-data \
pattern- \
plasma5-session \
polkit-default-privs \
qqc2-desktop-style \
xdg-user-dirs"

inherit rpm
