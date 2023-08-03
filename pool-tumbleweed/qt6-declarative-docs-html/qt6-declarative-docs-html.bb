SUMMARY = "Documentation for qt6-declarative in HTML format"
DESCRIPTION = "This package contains documentation for qt6-declarative in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ae7ecb17e2abd394eb445f47a0cfc232cd8a59ce33f33c747086e81a7d02a636f7cd9f4baa26c96b47b6d735133f6b4e0f5b3cc3984c71b417a2463a522687f9"

RPROVIDES:${PN} += "qt6-declarative-docs-html \
qt6-quickcontrols2-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
