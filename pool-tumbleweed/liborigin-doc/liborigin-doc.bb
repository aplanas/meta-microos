SUMMARY = "Documentation for liborigin"
DESCRIPTION = "This package provides the documentation for liborigin."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.2"

RPM_NAME = "liborigin-doc-3.0.2-1.1.noarch.rpm"
RPM_HASH = "a03de658ccd0f0481a9033c4e5894dbbab0d9c095347022ddb45854333eab11bf35fe52a89cc584c3ab12dd6a57208a757c06a00f96325f8ade086ef0ecd503d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liborigin-doc"

RDEPENDS:${PN} += ""

inherit rpm
