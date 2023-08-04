SUMMARY = "Qt 5 Development"
DESCRIPTION = "Tools and libraries for software development using Qt 5."
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-devel_qt5-20230801-1.1.noarch.rpm"
RPM_HASH = "4ca4eaa44b9b328b6d4264c3508c38970e9dfed429132c80d56e1357d85c36a179913509e6a9ea1c23e7b38eba7200e0205c28f08cb823daeb923b5c1e4026b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-devel-qt5 \
patterns-openSUSE-devel-qt5"

RDEPENDS:${PN} += "libqt5-qtbase-common-devel \
pattern-"

inherit rpm
