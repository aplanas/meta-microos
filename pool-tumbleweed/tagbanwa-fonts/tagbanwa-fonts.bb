SUMMARY = "Tagbanwa Fonts"
DESCRIPTION = "Font for the Tagbanwa script."
LICENSE = "CC-BY-2.5"

PV = "1.001"

RPM_NAME = "tagbanwa-fonts-1.001-3.17.noarch.rpm"
RPM_HASH = "bbe3650a8e357a04faff23637127d4ac6d44a537882d7d32343eee5376e710c798e2af366ca01150ee40a048121cee080c0abbc7db17ff22b279cc1dcf55482d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tagbanwa-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
