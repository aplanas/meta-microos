SUMMARY = "Python3 bindings for GEIS"
DESCRIPTION = "This package provides the python3 bindings for GEIS."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "python3-geis-2.2.17-4.10.aarch64.rpm"
RPM_HASH = "63da5f990223ecf1ba0c9071157bf75570c537d99ff68d9a0a0a5f80bc4bf48825bc32c7f4adacd16acfe34ee645edab125b2d7abb5f1ad88a6380217e9f5532"

RPROVIDES:${PN} += "python3-geis"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
