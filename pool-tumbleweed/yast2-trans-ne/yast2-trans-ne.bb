SUMMARY = "YaST2 - Nepali Translations"
DESCRIPTION = "YaST2 - Translations for Nepali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ne-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "57dbe207a56202349c4737b2a943f127fb7a110872c7dc994acb001f61d213f284e5479e06967bb4bcaaf4b7c82fa4f79263a47f32895bd7beb105af89cf2c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ne \
yast2-trans-ne"

RDEPENDS:${PN} += ""

inherit rpm
