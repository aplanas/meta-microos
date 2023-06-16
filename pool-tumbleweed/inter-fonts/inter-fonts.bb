SUMMARY = "The Inter font family"
DESCRIPTION = "Inter is a typeface specially designed for user interfaces with focus on high \
legibility of small-to-medium sized text on computer screens."
LICENSE = "OFL-1.1"

PV = "3.19"

RPM_NAME = "inter-fonts-3.19-1.6.noarch.rpm"
RPM_HASH = "af47e6b2562363170c945a735b4a4f8072467572ddb8bb7db835512d3eaacc55c78b8de7f4200d152f0e3c617b824429ee1d4746bd61b05b8137ec260cf1b611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inter-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
