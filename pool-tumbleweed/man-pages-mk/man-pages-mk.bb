SUMMARY = "Translation of man pages in Macedonian"
DESCRIPTION = "This package provides translations of man pages in Macedonian."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-mk-4.19.0-1.1.noarch.rpm"
RPM_HASH = "22fe9e91eb7af80fcac5bacee225165bb13fad74c87b7d8cd5c507453d44da6fb6e01b49131c7c91ba259b92442deefbdeb84d832b4c6e2c8d634b38018425e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:mk) \
man-pages-mk"

RDEPENDS:${PN} += "man-pages"

inherit rpm
