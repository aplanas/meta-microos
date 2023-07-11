SUMMARY = "Runtime and development documentation for gsoap"
DESCRIPTION = "This subpackage contains the documentation for the gSOAP toolkit."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.127"

RPM_NAME = "gsoap-doc-2.8.127-1.2.noarch.rpm"
RPM_HASH = "58e12dcc148d01c319f7a9e07723b4b0512142a3252a7513a89b0894a8770cfaf1b2948b8ec42dc4bc9bc327111437fe90cf1a76de6dac974f86d9e4581ab327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsoap-doc"

RDEPENDS:${PN} += ""

inherit rpm
