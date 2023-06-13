SUMMARY = "Korean TrueType fonts"
DESCRIPTION = "Collection of Korean TrueType fonts."
LICENSE = "GPL-2.0+"

PV = "1.0.20080608"

RPM_NAME = "un-fonts-1.0.20080608-11.17.noarch.rpm"
RPM_HASH = "24b4dc7c3bfea873fa1a506bb85d2107e20cdf4dbdd7eb3864e30edec71da144e7d0883b6f49d1925564579961077b885d74c58d1993f8b4866b3a9b8a7d5aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(ko) \
scalable-font-ko \
un-fonts \
unfonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
