SUMMARY = "Default version of npm"
DESCRIPTION = "Depends on the npm version associated with the current default \
version of nodejs for the current architecture and codestream."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "npm-default-6.0-2.1.aarch64.rpm"
RPM_HASH = "6751d95e66cca25a0e3987b35422a182a1b3108a30aac070101f0d86a491569339514f159575ad37aa00185b18ab693b54c67465fe5a5b8020ca4d1d527f8c28"

RPROVIDES:${PN} += "npm \
npm-default"

RDEPENDS:${PN} += "nodejs-default \
npm20"

inherit rpm
