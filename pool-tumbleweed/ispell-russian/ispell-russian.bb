SUMMARY = "Russian ispell dictionary"
DESCRIPTION = "This package includes a ready Russian dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "SUSE-Permissive"

PV = "1.5"

RPM_NAME = "ispell-russian-1.5-422.6.aarch64.rpm"
RPM_HASH = "a8324cc2af4a5c7983bac6a61cd85197787f2ca5f7497cf0a7cac034e37df17e53d53561369634010bed2ceeb997a335625b8b1df2fdc1c5415586c58924c511"

RPROVIDES:${PN} += "irussian \
ispell-russian \
ispell-russian(aarch-64) \
ispell_dictionary \
locale(ispell:ru)"

RDEPENDS:${PN} += ""

inherit rpm
