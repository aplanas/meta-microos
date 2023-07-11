SUMMARY = "Noto Nyiakeng Puachue Hmong Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NyiakengPuachueHmong Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-nyiakengpuachuehmong-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "364773ddcbd984b319ca9782f477e8246829050b34a6605dc318bef00f1a701fbab4312a253f29ad8734d54a4c9863349c93947a46c39be04a42ca14c4aeebf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-nyiakengpuachuehmong \
noto-serif-nyiakengpuachuehmong-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
