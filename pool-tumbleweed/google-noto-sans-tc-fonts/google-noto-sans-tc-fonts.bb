SUMMARY = "Noto Sans Traditional Chinese Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular and Bold \
weights of Sans font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "29ccd1678fc31a399cc5b025a0455a538be6cff786f05f94c5fe41d6ddec4aad16031e541da67b9e2726290d587c887171a4aa0dc7c602ef196b4d86a1e5758a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-fonts \
locale(;zh_TW) \
noto-sans-cjktc \
noto-sans-cjktc-fonts \
noto-sans-tc-fonts \
scalable-font-zh-TW"

RDEPENDS:${PN} += "google-noto-sans-tc-bold-fonts \
google-noto-sans-tc-regular-fonts"

inherit rpm
