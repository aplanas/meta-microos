SUMMARY = "Korean TrueType fonts"
DESCRIPTION = "Korean TrueType fonts by A Lee."
LICENSE = "Artistic-1.0+"

PV = "13.3"

RPM_NAME = "alee-fonts-13.3-1.2.noarch.rpm"
RPM_HASH = "66166dd414df364e83b4e31ff65f306cf9234a0bd9bf8468724679ca0d5ab9ae28cc1016141d40a3cf4aa546904ab1b14b3268c00b35f74aef222c861a098a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alee-fonts \
locale-ko \
scalable-font-ko \
ttf-alee"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
