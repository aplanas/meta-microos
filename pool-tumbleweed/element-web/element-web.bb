SUMMARY = "A glossy Matrix collaboration client - web files"
DESCRIPTION = "A glossy Matrix collaboration client - web files"
LICENSE = "Apache-2.0"

PV = "1.11.36"

RPM_NAME = "element-web-1.11.36-1.1.noarch.rpm"
RPM_HASH = "76ba8819eb0b930ca7bff4d724f9ab875b90733fd1340a2e80c5fd6604b3ddcacad433e3be029cc46cbc751a030f6dc00dcc957d6de6883648519cd540853652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-element-web \
element-web"

RDEPENDS:${PN} += ""

inherit rpm
