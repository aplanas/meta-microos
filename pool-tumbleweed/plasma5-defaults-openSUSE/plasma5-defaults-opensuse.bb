SUMMARY = "Default settings for KDE Plasma 5"
DESCRIPTION = "This package changes the default settings of Plasma 5."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-defaults-openSUSE-84.87~git20230131T131056~433af24-9.1.noarch.rpm"
RPM_HASH = "49acf4b6be1fe5ba062a08d179afcbad2534a56caec44913933c52f937d0b5e578802c8519a44eed71c83fe26969e26984173d9f9d9f3194fce62888e1409535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-plasma5-defaults-openSUSE \
plasma5-defaults-openSUSE"

RDEPENDS:${PN} += "distribution-logos-openSUSE-icons \
plasma5-theme-openSUSE"

inherit rpm
