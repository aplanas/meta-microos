SUMMARY = "Scalable 'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Gothic' Japanese TrueType font made by IPA (Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "004.01"

RPM_NAME = "ipa-ex-gothic-fonts-004.01-1.10.noarch.rpm"
RPM_HASH = "7b05be846eb0be7903ea591daee894e098ac59b57dd387711fb2cfdc3a9b62b28b9f9f993a3243ed79f50928eac0f1d7a525c162c85f60242cef8aa72b41ddaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ipa-ex-gothic-fonts \
locale-ja \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
