SUMMARY = "Pagure web interface theme used on Pagure.io"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the same look and feel as Pagure.io."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-pagureio-5.13.3-1.5.noarch.rpm"
RPM_HASH = "17a47c0e8ffe4ba1a1c30eeb0279c2cf00b078e7658a05324cbc962191d0364d5d280d6edeec61ebe97bbc5008038b0e2904406372885536296eabe1b25adb3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-pagureio"

RDEPENDS:${PN} += "pagure"

inherit rpm
