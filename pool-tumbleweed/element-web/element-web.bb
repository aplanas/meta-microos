SUMMARY = "A glossy Matrix collaboration client - web files"
DESCRIPTION = "A glossy Matrix collaboration client - web files"
LICENSE = "Apache-2.0"

PV = "1.11.34"

RPM_NAME = "element-web-1.11.34-1.1.noarch.rpm"
RPM_HASH = "3375f1d34b4fe7639fb6dc5a97d35b8162760d11903275268fc8bb3e979e9651e5e61312c42996e07122b09f77e457d15462daca1da73105315d7c111d7f5e40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-element-web \
element-web"

RDEPENDS:${PN} += ""

inherit rpm
