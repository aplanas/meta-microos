SUMMARY = "KDE Integrated Development Environment"
DESCRIPTION = "KDE software for development (editors, integrated development environments, and associated tools)."
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_ide-20230403-1.1.noarch.rpm"
RPM_HASH = "0e760b0a1db0ed44e724bf6150fea7380d2bbdadc024890311be71ee3708e3709d1c57b8121970a3fa04818e38521b2b689249e15553ffc7f8421f2ac2957a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-kde-kde_ide \
patterns-openSUSE-kde4_ide \
patterns-openSUSE-kde_ide"

RDEPENDS:${PN} += ""

inherit rpm
