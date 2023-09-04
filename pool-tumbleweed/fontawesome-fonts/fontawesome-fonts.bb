SUMMARY = "Iconic font set"
DESCRIPTION = "Scalable vector icons that can be customized — size, color, drop shadow, \
and anything that can be done with the power of CSS. \
 \
(Note that the font does not contain regular letters, and that icons \
are in the range U+F000..U+F23A.)"
LICENSE = "OFL-1.1"

PV = "6.4.2"

RPM_NAME = "fontawesome-fonts-6.4.2-1.1.noarch.rpm"
RPM_HASH = "3ce91755ec66a96cfe37a31db9ba175b411df5f18c94953e39217cd7476de51f0c54bc92e77636dafce0015c63383c0bdbc81802ddfe56f0396d99e6cd217a2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontawesome-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
