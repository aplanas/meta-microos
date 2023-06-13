SUMMARY = "Scalable 'Mincho' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Mincho' Japanese TrueType font made by IPA (Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "004.01"

RPM_NAME = "ipa-ex-mincho-fonts-004.01-1.10.noarch.rpm"
RPM_HASH = "9c460b4fd0bc86ac6ba03ce91abc6d755714679cee52d7481f000787a880768305deb73f08c94f442ec8e6626ad9c939c772e4e67e7220f99d25a58c602ee0d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ipa-ex-mincho-fonts \
locale(ja) \
scalable-font-ja"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
