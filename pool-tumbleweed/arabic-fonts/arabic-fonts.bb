SUMMARY = "A Collection of Free Arabic Fonts"
DESCRIPTION = "A collection of free Arabic fonts available from \
http://www.arabeyes.org/resources.php."
LICENSE = "GPL-2.0-only & SUSE-Public-Domain & OFL-1.1"

PV = "0.20161120"

RPM_NAME = "arabic-fonts-0.20161120-18.15.noarch.rpm"
RPM_HASH = "d54a2334ff500468a23a4abe4de2d110fb8bad7b77ae0e0e02fa5d31a0470ec1256b59a60533008bec675372ec844687a417d8cbffcaedce2de2b13845b29c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-fonts \
fonts-arabic \
locale(ar) \
scalable-font-ar"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
arabic-ae-fonts \
arabic-bitmap-fonts \
arabic-kacst-fonts \
arabic-kacstone-fonts \
arabic-naqsh-fonts \
coreutils \
perl"

inherit rpm
