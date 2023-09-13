SUMMARY = "Helper bridge between NodeJS projects and their dependencies"
DESCRIPTION = "Zero-runtime-dependency package acting as bridge between Node projects \
and their package managers."
LICENSE = "MIT"

PV = "20.6.0"

RPM_NAME = "corepack20-20.6.0-2.1.aarch64.rpm"
RPM_HASH = "b0f9f286ba106e2875cef97963ee933a96479b8b249d226b0d89315ec92cb4cfff372a790162125c9fcbcda4fff5c18bfce53b5353b1e3812b65e18faea93d0d"

RPROVIDES:${PN} += "corepack20"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
nodejs-common"

inherit rpm
