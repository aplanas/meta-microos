SUMMARY = "Headers for default version of nodejs"
DESCRIPTION = "Depends on the most current and up-to-date version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "nodejs-devel-default-5.1-2.1.aarch64.rpm"
RPM_HASH = "5014c2165e5c453d9dffe54c02492ba67eee064c5d80fbbfca8bf39ec423f6a3af761cb5edf293d63f3939681ccc0892137a1eccd1325bff9cfef916b272c8e1"

RPROVIDES:${PN} += "nodejs-devel \
nodejs-devel-default \
nodejs-devel-default(aarch-64)"
RDEPENDS:${PN} += "nodejs20-devel \
npm-default"

inherit rpm
