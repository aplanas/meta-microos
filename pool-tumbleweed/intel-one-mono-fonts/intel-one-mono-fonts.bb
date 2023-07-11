SUMMARY = "An expressive monospaced font family"
DESCRIPTION = "Intel One Mono is an expressive monospaced font family. \
 \
Identifying the typographically underserved low-vision developer \
audience, Frere-Jones Type designed the Intel One Mono typeface in \
partnership with the Intel Brand Team and VMLY&R, for maximum \
legibility to address developers' fatigue and eyestrain and reduce \
coding errors. A panel of low-vision and legally blind developers \
provided feedback at each stage of design."
LICENSE = "OFL-1.1"

PV = "1.2.1"

RPM_NAME = "intel-one-mono-fonts-1.2.1-1.1.noarch.rpm"
RPM_HASH = "56e274362036fa100e744e4625d5e1458e0a999a928a63162373d0f6559565e72d8e2f2a0df69c61dea9b4d86c97573301dc2c440df276ec486f7c9eea1ebd49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intel-one-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
