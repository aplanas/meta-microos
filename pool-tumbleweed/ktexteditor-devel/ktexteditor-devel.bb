SUMMARY = "Header files for ktexteditor, an embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library. \
 \
This subpackage provides the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "ktexteditor-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "eb8c03929e7af1b07d5887e3145f5e6199f597ea144400772e4f2fea2756ebbe8ce6a0bd59658bc6a1720aa1775b78dc4f43d6a08a21c6940c392590aa570c4f"

RPROVIDES:${PN} += "cmake-KF5TextEditor \
ktexteditor-devel"

RDEPENDS:${PN} += "cmake-KF5Parts \
cmake-KF5SyntaxHighlighting \
extra-cmake-modules \
ktexteditor"

inherit rpm
