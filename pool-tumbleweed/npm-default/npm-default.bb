SUMMARY = "Default version of npm"
DESCRIPTION = "Depends on the npm version associated with the current default \
version of nodejs for the current architecture and codestream."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "npm-default-6.0-1.1.aarch64.rpm"
RPM_HASH = "eef5509341d3a0aea0300524790ffc552e4c8816f62338fe71c418012cce7967485234e9195c2228c5280342a62b4e3644ce6fdc738651cdd7a733773b2a3662"

RPROVIDES:${PN} += "npm \
npm-default"

RDEPENDS:${PN} += "nodejs-default \
npm20"

inherit rpm
