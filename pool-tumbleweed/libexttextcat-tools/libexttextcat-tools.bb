SUMMARY = "Tool for creating custom document fingerprints"
DESCRIPTION = "The libexttextcat-tools package contains the createfp program that allows \
you to easily create your own document fingerprints."
LICENSE = "BSD-4-Clause"

PV = "3.4.6"

RPM_NAME = "libexttextcat-tools-3.4.6-1.3.aarch64.rpm"
RPM_HASH = "69114d60aa561ea8af1afcfb6e9ad66282301b02af4ba88cd9cdecde479a7b3563102f81afb98b63caf63ad930ec5e4d623723dacf6068dd3260bf80c4057480"

RPROVIDES:${PN} += "libexttextcat-tools"

RDEPENDS:${PN} += "libc.so.6 \
libexttextcat-2.0.so.0"

inherit rpm
