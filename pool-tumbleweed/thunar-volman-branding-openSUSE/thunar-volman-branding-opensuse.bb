SUMMARY = "openSUSE Branding of thunar-volman"
DESCRIPTION = "This package provides the openSUSE look and feel for the Thunar Volume Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "thunar-volman-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "7116163f1423915c284f35edc58e8dc36191e6252998c0da899f8aba28b088bd052df16c124c7142a1e9e113f2012458f740695a7abd67a3557f9e8d9b4760aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-thunar-volman-branding-openSUSE \
thunar-volman-branding \
thunar-volman-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
