SUMMARY = "YaST2 - Japanese Translations"
DESCRIPTION = "YaST2 - Japanese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ja-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "c0ec0f2a5b10cd37d11784ebc87779c23b0e7e3b6b296e3a0bedd827d1feaa452d5dd0e5a5e9befae3b0707f9b739797339d05e2b587975ec5ddf16cd6300218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ja \
yast2-trans-ja"

RDEPENDS:${PN} += ""

inherit rpm
