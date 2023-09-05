SUMMARY = "openSUSE Tumbleweed branding for YaST2 Qt"
DESCRIPTION = "openSUSE Tumbleweed branding for YaST2 Qt, mainly used for installation"
LICENSE = "BSD-3-Clause"

PV = "84.87.20230227"

RPM_NAME = "yast2-qt-branding-openSUSE-84.87.20230227-2.1.noarch.rpm"
RPM_HASH = "f506d040ad7da5e8506f62064a0678408c58083b3505cb1cfb319f1ff448433c4834fd45cf8604b25bf5701531d1a254bc1cbc2dd3a29a036d222aedc730b269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-qt-branding \
yast2-qt-branding-openSUSE"

RDEPENDS:${PN} += "adobe-sourcesans3-fonts \
distribution-logos \
google-opensans-fonts"

inherit rpm
