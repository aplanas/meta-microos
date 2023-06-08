SUMMARY = "Enlightenment theme from openSUSE 13.1"
DESCRIPTION = "This is a darker theme for enlightenment, it was the default for openSUSE 13.1"
LICENSE = "BSD-2-Clause & LGPL-2.1 & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-oliveleaf-20220219.1.26-1.10.noarch.rpm"
RPM_HASH = "99d4f001d06e5bc46f9687999f975a0ce021abbc4cc9a5815c1d0a0b2322930938c37824305aac1caf61646716dd5ef3cc3ef8a8851273a935ff0e82c421436f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme enlightenment-theme-openSUSE-oliveleaf"
RDEPENDS:${PN} += ""

inherit rpm
