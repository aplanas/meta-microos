SUMMARY = "YaST2 - Hindi Translations"
DESCRIPTION = "YaST2 - Translations for Hindi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-hi-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "02d20e8d0f109b4cf15efdae0ed9df6de4efdda6af592b43959de78cdd53aa4a5903219f9d0d77a00e1f204ca9d2904288d0959d68d822e13d712d7709b02286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hi \
yast2-trans-hi"

RDEPENDS:${PN} += ""

inherit rpm
