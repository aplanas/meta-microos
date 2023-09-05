SUMMARY = "Headers for default version of nodejs"
DESCRIPTION = "Depends on the most current and up-to-date version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "nodejs-devel-default-6.0-2.1.aarch64.rpm"
RPM_HASH = "bdc9b9c3dabfe83ad2e3af7049430c14927a7c5e2f24e04860bb4a7937b8c99a7b242a9a67de0d1c581072d2df2a37b40ee1d3be5766771bfdb85da89b211dd1"

RPROVIDES:${PN} += "nodejs-devel \
nodejs-devel-default"

RDEPENDS:${PN} += "nodejs20-devel \
npm-default"

inherit rpm
