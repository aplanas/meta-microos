SUMMARY = "International Tag Set for GTK+ 3"
DESCRIPTION = "This package enhances gettext with an International Tag Set for GTK+ 3"
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gettext-its-gtk3-3.24.38-2.1.noarch.rpm"
RPM_HASH = "6da0fa1b59155a13586291d068febbd80290132f972d14938828181b19ef90d5454c8caa553b1752f0535415824d8af5e9652d6c50477d726f0acb46d5ec5118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-its-gtk3"

RDEPENDS:${PN} += ""

inherit rpm
