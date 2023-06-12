SUMMARY = "Monospace font similar to Courier"
DESCRIPTION = "Courier Prime is a Courier-like monospace fonts for screenplay (and other use cases). \
It is optimized for 12 point size and matches the metrics of Courier."
LICENSE = "OFL-1.1"

PV = "1.203"

RPM_NAME = "courier-prime-fonts-1.203-2.14.noarch.rpm"
RPM_HASH = "48a91ed020d1a14d63a8504a098fefc32df2320778b553c246be8aee70b204ae587c2d4ed6c50b78479d60c6f4c86832053ba303e54f0deb2d9ba43579e4623a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "courier-prime-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
