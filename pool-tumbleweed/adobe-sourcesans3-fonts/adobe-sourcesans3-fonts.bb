SUMMARY = "A set of OpenType fonts designed for user interfaces"
DESCRIPTION = "Source Sans is a set of OpenType fonts that have been designed to work well in user interface (UI) environments, as well as in text setting for screen and print."
LICENSE = "OFL-1.1"

PV = "3.052"

RPM_NAME = "adobe-sourcesans3-fonts-3.052-1.1.noarch.rpm"
RPM_HASH = "1814dbf34cfc507253aa9d7d8bcf4ce3153f093e5963b7382f958757e6896a799ad60d1ded7161543fcdb1ea204559e8febac0e61c3f144e5144a806109190ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcesans3-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
