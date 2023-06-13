SUMMARY = "Default sRGB ICC profile +"
DESCRIPTION = "The 'WWW standard' sRGB colorimetry in a ICC profile and others."
LICENSE = "Zlib"

PV = "1.3"

RPM_NAME = "icc-profiles-openicc-rgb-1.3-16.21.noarch.rpm"
RPM_HASH = "668c7fd857815bc25ce59615728b6d15a152cea2d489e99b3c4aaba5e353587a0b3e8ebc7bafb7dc25e3c8db9dcff1ca898347fbc55ac12160121f664de46868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-openicc-rgb"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
