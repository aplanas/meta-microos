SUMMARY = "Blog compiler"
DESCRIPTION = "blogc is a blog compiler. It converts source files and templates into blog/website resources."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "blogc-0.20.1-1.11.aarch64.rpm"
RPM_HASH = "5c9dd12f31ef1b626a316c39dca8a6605e11b78b848f6e09855731df3327c55f4c6ed81e921803147de5dde67ff0aa3d66f1eb4828f2a949c5d0bc7a8bc3e26c"

RPROVIDES:${PN} += "blogc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
