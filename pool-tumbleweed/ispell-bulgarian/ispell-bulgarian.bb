SUMMARY = "Bulgarian Ispell Dictionary"
DESCRIPTION = "This packages includes a ready Bulgarian dictionary for ispell. \
A short usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the packages ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0+ | MPL-1.1 | LGPL-3.0+"

PV = "4.2"

RPM_NAME = "ispell-bulgarian-4.2-1.14.noarch.rpm"
RPM_HASH = "59147108894eb892b48eabaa483b0a037619ee9fa77402a949f8a839f12eff2295c93b0ccbd1aff2ad4ee758f86476b7c874a0781a8c565ee1449512e20783ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ispell-bulgarian \
ispell-dictionary \
locale-ispell-bg"

RDEPENDS:${PN} += ""

inherit rpm
