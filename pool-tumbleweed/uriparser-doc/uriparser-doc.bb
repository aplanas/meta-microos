SUMMARY = "Documentation files for the uriparser URI parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
This subpackage contains the documentation for uriparser."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "uriparser-doc-0.9.7-1.4.aarch64.rpm"
RPM_HASH = "7e0a1c45ca0db425390034c3049bda3a0da06a9c250a65634d288f1fa148d5884c7f6c41d07df364d884166c764eb0568f8d77a7848ed9b5f0ea0005a8b23428"

RPROVIDES:${PN} += "uriparser-doc"

RDEPENDS:${PN} += ""

inherit rpm
