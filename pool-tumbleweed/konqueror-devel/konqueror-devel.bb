SUMMARY = "KDE Konqueror Libraries: Build Environment"
DESCRIPTION = "Development package for the konqueror libraries."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konqueror-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ac06ccc39b91b9d274e3085d30110247cdf024ca0926b162386edaaf0efa9b03de68e49088ad3f931ef2c1551bcf7d74b557d0dae3db6974a83d9e683ff513ca"

RPROVIDES:${PN} += "cmake-KF5Konq \
kde-baseapps-devel \
kde-baseapps5-devel \
konqueror-devel \
libkonq-devel"

RDEPENDS:${PN} += "konqueror"

inherit rpm
