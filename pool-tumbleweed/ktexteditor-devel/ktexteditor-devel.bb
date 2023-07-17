SUMMARY = "Header files for ktexteditor, an embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library. \
 \
This subpackage provides the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "ktexteditor-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "ead7b93d960aaac318c273926dbdbdf18b54498500675df9dded4f51100eb5bb91c043a754752ee08c08ba0d11d37233b3fd1ad08ee54dffeb4fa423e8404647"

RPROVIDES:${PN} += "cmake-KF5TextEditor \
ktexteditor-devel"

RDEPENDS:${PN} += "cmake-KF5Parts \
cmake-KF5SyntaxHighlighting \
extra-cmake-modules \
ktexteditor"

inherit rpm
