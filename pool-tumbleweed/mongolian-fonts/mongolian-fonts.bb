SUMMARY = "Traditional Mongolian Fonts"
DESCRIPTION = "Mongolian Art, Mongolian Title, Mongolian White and Mongolian Writing font families."
LICENSE = "GPL-2.0"

PV = "2011.11"

RPM_NAME = "mongolian-fonts-2011.11-3.17.noarch.rpm"
RPM_HASH = "5d69eb0a10b58bc9df6c101c88a3e5ce9a5784f66c28d25bb79d199f33538addb36c07f97002f583ffdaf23fd41838ba974ba57b58f7d86828714980421ddc49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mongolian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
