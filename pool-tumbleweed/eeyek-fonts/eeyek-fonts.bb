SUMMARY = "Meetei Mayek Unicode Font"
DESCRIPTION = "Eeyek Unicode TrueType Font allows you to read and write in Meetei Mayek script."
LICENSE = "GPL-2.0+"

PV = "20091204"

RPM_NAME = "eeyek-fonts-20091204-3.17.noarch.rpm"
RPM_HASH = "a47386a61e4d4896da2c613fd008eeb480d63c469a5f7bddb6f122d001b05054f39c23136fe6f4092ce02a39811c378183f8512f86b2f30d3428a1d797fd1851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eeyek-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
