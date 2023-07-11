SUMMARY = "YaST2 - Persian Translations"
DESCRIPTION = "YaST2 - Persian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-fa-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "8c7ed94829e05414f6bef47dd73191025470ec5308cbdbd0d5da5075df3ad269f88fa50f4cfb8690ee53b4bcd69d0213f9d0c6ed469457f133f9f397cc47db4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fa \
yast2-trans-fa"

RDEPENDS:${PN} += ""

inherit rpm
