SUMMARY = "Static libraries and headers for fastjet-contrib"
DESCRIPTION = "This package provides the static libraries for fastjet-contrib to link against."
LICENSE = "GPL-2.0-only"

PV = "1.049"

RPM_NAME = "fastjet-contrib-devel-static-1.049-1.3.aarch64.rpm"
RPM_HASH = "646b1fd357afa03193e4b059b04c7c5ff3579225b8a77f6dad40b199a10a29ae000bff01da1002495a412eaaf317cffd386f93c501b8c318decd6be143e49fbb"

RPROVIDES:${PN} += "fastjet-contrib-devel-static \
fastjet-contrib-devel-static(aarch-64)"
RDEPENDS:${PN} += "fastjet-contrib-devel"

inherit rpm
