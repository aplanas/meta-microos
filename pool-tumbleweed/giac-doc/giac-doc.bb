SUMMARY = "Documentation for giac"
DESCRIPTION = "This document describes the basic structure and provides information on \
usage of giac, a computer algebra system."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "giac-doc-1.9.0.27-4.6.noarch.rpm"
RPM_HASH = "d6e63ca68692f95030059ec7af5e6545156e22f2d87ffb662d2748f9a9d4052bb95fa94c2b53929081a18d584d9e5696bf6340f82929a753ebcfbfe7e6b46c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "giac-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
