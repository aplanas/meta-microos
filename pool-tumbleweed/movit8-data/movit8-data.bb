SUMMARY = "Data files for the Movit GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the architecture-independent data files (GLSL \
fragment shaders)."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.3"

RPM_NAME = "movit8-data-1.6.3-1.15.noarch.rpm"
RPM_HASH = "53f5a0ff6259e70580af2b41106515d31e59325897ee35d49b6f87e5fe7e928c062d44dd65da93ec3ba6ca4101616b043cf9000e172021a8357d2ce9273cfe53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "movit-data \
movit8-data"

RDEPENDS:${PN} += ""

inherit rpm
