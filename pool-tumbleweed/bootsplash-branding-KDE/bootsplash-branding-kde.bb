SUMMARY = "KDE Bootsplash Theme"
DESCRIPTION = "This package contains a KDE branded theme."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "bootsplash-branding-KDE-3.3-13.15.noarch.rpm"
RPM_HASH = "74267cf5953af398e834715d2a989f6b9b9b53681028d8390106ac4da6ffdd4eb9e845b1072bb304c2a83fd3876922b91ed182cb5e83007a47f759764f919677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootsplash-branding \
bootsplash-branding-KDE \
config-bootsplash-branding-KDE"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
bootsplash \
fillup \
perl"

inherit rpm
