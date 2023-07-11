SUMMARY = "Pkgconfig file for xml2po"
DESCRIPTION = "xml2po is a Python program which extracts translatable content from \
free-form XML documents and outputs gettext compatible POT files."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.10"

RPM_NAME = "xml2po-devel-0.20.10-21.6.noarch.rpm"
RPM_HASH = "97be96e94f6626d55f0bee5cad4f34494b6af58a18615a9d69836695113682a0ba8b7770ba6bd5fb0521b455cbd1ee300b2177eabd27a86419d66eafc31d3f2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xml2po \
xml2po-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xml2po"

inherit rpm
