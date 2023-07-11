SUMMARY = "API documentation for libyang"
DESCRIPTION = "This is the API documentation of libyang."
LICENSE = "BSD-3-Clause"

PV = "2.1.55"

RPM_NAME = "libyang-doc-2.1.55-1.2.noarch.rpm"
RPM_HASH = "ec5e8bb2e006b6a100c5f0b8d1caee5e9bbf35ae0bbb1b8728e11e78107f1900efd56e3b34f29a6d59446024be95295d12a4ff23fd08dd89770f39630bfbcce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libyang-doc"

RDEPENDS:${PN} += ""

inherit rpm
