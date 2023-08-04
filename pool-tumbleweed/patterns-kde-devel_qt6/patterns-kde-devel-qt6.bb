SUMMARY = "Qt 6 Development"
DESCRIPTION = "Tools and libraries for software development using Qt 6."
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-devel_qt6-20230801-1.1.noarch.rpm"
RPM_HASH = "9a429367756cf66e29331c6325856ec7eefbbeb887c788537bfa2ad76b4316dcdd647f25b5ceef9bc5ef2e96c4e30f5eab2acc6a1c8c894249030d72206c09a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-devel-qt6 \
patterns-openSUSE-devel-qt6"

RDEPENDS:${PN} += "pattern- \
qt6-base-common-devel"

inherit rpm
