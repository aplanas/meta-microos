SUMMARY = "GTK libfm libraries"
DESCRIPTION = "libfm developers documentation"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-doc-1.3.2-1.13.aarch64.rpm"
RPM_HASH = "40369704c73ec7e9dd8ff485c643e2cd6bf059f310779ae9ba99238360627702cb8badad0a60b05f6d35b6808813a25cd0c6074da39e6a41eb52afcc2fbfc0cd"

RPROVIDES:${PN} += "libfm-doc"

RDEPENDS:${PN} += "libfm"

inherit rpm
