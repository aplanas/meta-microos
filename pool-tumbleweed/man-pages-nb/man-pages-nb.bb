SUMMARY = "Translation of man pages in Norwegian Bokmål"
DESCRIPTION = "This package provides translations of man pages in Norwegian Bokmål."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-nb-4.20.0-1.1.noarch.rpm"
RPM_HASH = "2c5dbd86955db6375085e747f368921682a28e59df68f0ddc0165df09584a726de9832e1d7df50062e8dd4a5625d189d0315c7d2183c3d3abaa3c49e68b17a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-nb \
man-pages-nb"

RDEPENDS:${PN} += "man-pages"

inherit rpm
