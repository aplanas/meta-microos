SUMMARY = "A language for application scale JavaScript development"
DESCRIPTION = "TypeScript is a language for application-scale JavaScript. TypeScript adds \
optional types, classes, and modules to JavaScript. TypeScript supports tools \
for large-scale JavaScript applications for any browser, for any host, on any \
OS. TypeScript compiles to readable, standards-based JavaScript."
LICENSE = "Apache-2.0"

PV = "4.2.4"

RPM_NAME = "typescript-4.2.4-1.10.noarch.rpm"
RPM_HASH = "fdf9f4a2aef4e7951a0f2dc4a4a2039232dfd32781f03d47233b1236a3fa80f36e341790442864540b293c113869b1f30051d34ffb7dfa67adf31ea30c7cbc78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "npm-typescript \
typescript"

RDEPENDS:${PN} += "/usr/bin/node \
nodejs-engine"

inherit rpm
