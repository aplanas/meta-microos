SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Black weight of \
Sans font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-black-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "c618bc605e27c93938c9f229172484bfbe266b62e03e17ba7d196b0f99e42f51eaaa046a8e339351dfb759487d6d5de307d141b445c3e7375f8d8de0ea5a7e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-black-fonts \
noto-sans-hk-black-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
