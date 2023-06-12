SUMMARY = "A utility belt library for JavaScript"
DESCRIPTION = "Underscore.js is a utility belt library for JavaScript that provides support \
for the usual functional suspects (each, map, reduce, filter...) without \
extending any core JavaScript objects."
LICENSE = "MIT"

PV = "1.13.6"

RPM_NAME = "nodejs-underscore-1.13.6-1.3.noarch.rpm"
RPM_HASH = "22d35b65f713cc48531536a312dd42846ced537dd5f8e1120c24fad70f20962dbd83b8ea219587014ce94f6750a9e5cd1dae4c7fa0726d51952aa59be5d2f61a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-underscore \
npm(underscore)"
RDEPENDS:${PN} += ""

inherit rpm
