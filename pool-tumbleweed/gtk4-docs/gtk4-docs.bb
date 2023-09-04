SUMMARY = "Developer documentation for GTK"
DESCRIPTION = "This package contains developer documentation for version 4 of the GTK \
widget toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "gtk4-docs-4.12.0-2.1.noarch.rpm"
RPM_HASH = "ec4d949f8ebc153e7fdd75b267474aeef704902eac57510fb601a7c3debd02adc5dcd10ef1ab1b759056aba76e7065658ab83c5dfe1f6ec903645197c9e71c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-docs"

RDEPENDS:${PN} += ""

inherit rpm
