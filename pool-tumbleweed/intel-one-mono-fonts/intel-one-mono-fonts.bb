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

PV = "1.3.0"

RPM_NAME = "intel-one-mono-fonts-1.3.0-1.1.noarch.rpm"
RPM_HASH = "660ea4dfd717a07787bd259269b08458fa9f68c5decd6024f4ba997edf6607471a240c223c0ba54c5beddad1af0489345d7082f3f639b23def514d4f7ea7c1bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intel-one-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
