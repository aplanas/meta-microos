SUMMARY = "Enhanced Base System"
DESCRIPTION = "This is the enhanced base runtime system with lots of convenience packages."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-enhanced_base-20200505-41.1.aarch64.rpm"
RPM_HASH = "2cb3e58fd663f04a8e4d805e2ea3eef62e9d024f03933b7cd25f8001dbf06ffd45ac6b8abcf2a536f81af90dc4a3dce86865f8db224182ea35f5f98e52becbe0"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-enhanced-base \
patterns-openSUSE-enhanced-base"

RDEPENDS:${PN} += "openssh \
pattern-"

inherit rpm
