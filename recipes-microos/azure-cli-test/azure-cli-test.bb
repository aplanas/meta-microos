SUMMARY = "Microsoft Azure CLI 2.0"
DESCRIPTION = "Microsoft Azure CLI 2.0 Command Line Utilities"
LICENSE = "MIT"

PV = "2.48.1"

RPM_NAME = "azure-cli-test-2.48.1-1.1.aarch64.rpm"
RPM_HASH = "0cf9b574c65ae537a128e2cb4e77f2c2f2eec5e890909f322cb7f7d9851a749a2220fb2cebc11d142294c250987f5d768d72e97bc7fd8402e8781236353eee3b"

RPROVIDES:${PN} += "azure-cli-test azure-cli-test(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
