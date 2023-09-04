SUMMARY = "YaST2 - Tajik Translations"
DESCRIPTION = "YaST2 - Tajik translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-tg-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "0b268403920970cea82a5c292aa4394b2b17211d16f3d6371ffb740464c24876d238643ef64375c6a2a5a1c79f77f9939e9a7b0bb2c1be22fb46701bfb3479f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tg \
yast2-trans-tg"

RDEPENDS:${PN} += ""

inherit rpm
