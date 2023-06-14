SUMMARY = "Liberation Fonts"
DESCRIPTION = "Free fonts which are metric-compatible to 'Arial', 'Times New Roman' \
and 'Courier New'."
LICENSE = "SUSE-Liberation"

PV = "2.1.5"

RPM_NAME = "liberation-fonts-2.1.5-1.6.noarch.rpm"
RPM_HASH = "c2a8b2128a8d5b508cabb9760d9410c8f72d1937ea848a5ce79ea807961db7c892b3ccf3b3711d0be788ab8f5469547a666bc5e61abf900f45cdd1fc5922d6dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liberation-fonts \
locale-bg;el;ru;bg"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
