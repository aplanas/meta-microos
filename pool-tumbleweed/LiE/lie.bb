SUMMARY = "A Computer algebra package for Lie group computations"
DESCRIPTION = "LiE is a computer algebra system that is specialised in computations \
involving (reductive) Lie groups and their representations."
LICENSE = "LGPL-3.0+"

PV = "2.2.2"

RPM_NAME = "LiE-2.2.2-6.33.aarch64.rpm"
RPM_HASH = "846010e21f5fc87b9bb008c510e1194aef4019a253438a792bdde292c1c93cfb45164d63046f57ec773c3e5357e371d6e61b03d03ffc0ca8b818eb8eed4b76aa"

RPROVIDES:${PN} += "LiE"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libreadline.so.8"

inherit rpm
