SUMMARY = "Headers for default version of nodejs"
DESCRIPTION = "Depends on the most current and up-to-date version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "nodejs-devel-default-6.0-1.1.aarch64.rpm"
RPM_HASH = "027859f434220f5f7db51afd880431ec88f0395a6a0de1760f285383ce600fd232bda017635f13dada6b792d7a3231832ffed7da26de8eb8c4c8633a20cf0885"

RPROVIDES:${PN} += "nodejs-devel \
nodejs-devel-default"

RDEPENDS:${PN} += "nodejs20-devel \
npm-default"

inherit rpm
