SUMMARY = "OpenType Font for Telugu"
DESCRIPTION = "Free OpenType font for Telugu created by Dr. Tirumala Krishna \
Desikacharyulu"
LICENSE = "GPL-2.0+"

PV = "1.1"

RPM_NAME = "pothana2000-fonts-1.1-147.17.noarch.rpm"
RPM_HASH = "2a55775e324a6887bd9cda30302a25a450350c74d4e5512a4c0c9eb42753b6b767dce8918176bb769d43a67484c74975220adf99b810fbd78f11943169218694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-te \
pothana2000 \
pothana2000-fonts \
scalable-font-te"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
