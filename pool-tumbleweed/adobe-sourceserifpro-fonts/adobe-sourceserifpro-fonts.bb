SUMMARY = "A set of OpenType fonts designed for user interfaces"
DESCRIPTION = "A set of serif OpenType fonts designed to complement Source Sans Pro"
LICENSE = "OFL-1.1"

PV = "3.000"

RPM_NAME = "adobe-sourceserifpro-fonts-3.000-2.6.noarch.rpm"
RPM_HASH = "19e4263cc1cd1177edd430b6fdc9cf87ec19a5db215f47945bbcb824946007a0b1d895bfa620711a9f8f2eefedc1952d6f6105cb4351f1440be2073a99966e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourceserifpro-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
