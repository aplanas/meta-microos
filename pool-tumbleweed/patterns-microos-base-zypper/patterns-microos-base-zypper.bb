SUMMARY = "openSUSE MicroOS using Zypper"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the Zypper package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-zypper-5.0-70.1.aarch64.rpm"
RPM_HASH = "9c3ea2b764cc9e70eb2f0d031e3838c79d2afa38af868108529437086bcddeaae4039fac25867e8552859abcabe85b811a6ba232c171f7db7fe34edf24a058c7"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-microos-base-zypper \
patterns-microos-base-zypper(aarch-64)"
RDEPENDS:${PN} += "pattern() \
transactional-update \
transactional-update-zypp-config \
zypper \
zypper-needs-restarting"

inherit rpm
