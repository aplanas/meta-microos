SUMMARY = "YaST2 - Kannada Translations"
DESCRIPTION = "YaST2 - Translations for Kannada."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-kn-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "d91b9ec6676d8177c2fcd6bb32e60bc3645f8474383f4dc8dd7daf4fa0c3c8b5ca3391570cad1f27c4e5f9719ca05ba727d852c0ec6936229279d1b3296bda32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-kn"

RDEPENDS:${PN} += ""

inherit rpm
