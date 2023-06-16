SUMMARY = "Noto Sans Korean Font - DemiLight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Demilight weight \
of Sans font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-demilight-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "df4c79e50d1e8fdb7ea8ab4a4e99d5caf85feffe4b1a0c9ad4dba290852485929e26209f861442a8e82313509964c66fc14a902baddb5c0672f17d5fe4979311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-demilight-fonts \
noto-sans-kr-demilight-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
