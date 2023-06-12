SUMMARY = "Documentation for the libaom API"
DESCRIPTION = "This package contains the API documentation for libaom, a library \
for the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.6.1"

RPM_NAME = "libaom-devel-doc-3.6.1-1.1.noarch.rpm"
RPM_HASH = "955fa981b53b1f0dfdb3dbd4dbdfd7880aa6d487df40e415a24abcfbb6c444392a646d99de0488922e448518b354e0cecd8af60f5a76211311dc05a15afaecae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libaom-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
