SUMMARY = "YaST2 - Slovak Translations"
DESCRIPTION = "YaST2 - Slovak Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-sk-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "d5bc6f5605e047642ed147b3904ae2dc73c2d06e5e84169379067d29838b0dd11db5ac5a2550606c257ad0e2664de9f8593674d38c1d0d8c6ed9b5410ba896be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sk \
yast2-trans-sk"

RDEPENDS:${PN} += ""

inherit rpm
