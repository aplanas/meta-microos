SUMMARY = "Qt 5 API Documentation in HTML format"
DESCRIPTION = "This package contains the Qt API documentation in html format."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.9"

RPM_NAME = "libqt5-qtdoc-html-5.15.9-2.3.noarch.rpm"
RPM_HASH = "90e6cd6e4788045049f0dbad31d7322fc1b2b0bae2673a2191d75cc0baa7f6702076a929b2db13ab4ab92881f6d3287c7406834237dbd7ac38baf410f6b3809f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtdoc-html"

RDEPENDS:${PN} += ""

inherit rpm
