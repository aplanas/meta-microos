SUMMARY = "A language for application scale JavaScript development"
DESCRIPTION = "TypeScript is a language for application-scale JavaScript. TypeScript adds \
optional types, classes, and modules to JavaScript. TypeScript supports tools \
for large-scale JavaScript applications for any browser, for any host, on any \
OS. TypeScript compiles to readable, standards-based JavaScript."
LICENSE = "Apache-2.0"

PV = "5.2.2"

RPM_NAME = "typescript-5.2.2-1.1.noarch.rpm"
RPM_HASH = "6545ddcb02639d5aef3a0c92f84e68387e5eb596afe88259f4ae9bc9b3bd94910f1729724b0a3750601e9b29184a0dffac5d74b5715da49b49a5e2b60e954904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "npm-typescript \
typescript"

RDEPENDS:${PN} += "/usr/bin/node \
nodejs-engine"

inherit rpm
