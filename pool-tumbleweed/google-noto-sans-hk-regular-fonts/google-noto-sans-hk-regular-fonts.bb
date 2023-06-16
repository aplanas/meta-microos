SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular weight \
of Sans font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-regular-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "2328a21b688f8f9053d28df6c670ebc321b5e628ee7792180eac25bd0b90261ae4fe9394c722727006d24545027863a7fc0b4a46a99b3a82ff14149a21e01ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-regular-fonts \
noto-sans-hk-regular-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
