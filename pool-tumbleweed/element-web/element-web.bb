SUMMARY = "A glossy Matrix collaboration client - web files"
DESCRIPTION = "A glossy Matrix collaboration client - web files"
LICENSE = "Apache-2.0"

PV = "1.11.30"

RPM_NAME = "element-web-1.11.30-2.1.noarch.rpm"
RPM_HASH = "56c8a6c3e3d6c9ae505e26211a593247e0bd204025780b03e6c0b9264ed186c6f9ede6bf358a757ebc0bbd4780bfae2a83ddfd93a752da0914fd6d87734bf4af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-element-web \
element-web"

RDEPENDS:${PN} += ""

inherit rpm
