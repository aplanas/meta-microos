SUMMARY = "Minimal locale archive for very small systems"
DESCRIPTION = "This package contains a glibc locale archive with the C.UTF-8 and \
en_US.UTF-8 locale for very minimal systems only supporting \
english as locale."
LICENSE = "GPL-2.0+ & MIT & LGPL-2.1+"

PV = "2.37"

RPM_NAME = "kubic-locale-archive-2.37-3.16.noarch.rpm"
RPM_HASH = "36fb06b69a036af1d1c5a8d7b1ba5c89fb3f56479efad4942580c9e44173062ba54d658693f8a3ca13876c18899dee0d3e6ee54cf97240ec693ef7bc5a341123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubic-locale-archive"
RDEPENDS:${PN} += "glibc"

inherit rpm
