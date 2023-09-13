SUMMARY = "Development headers for NodeJS 20.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "20.6.0"

RPM_NAME = "nodejs20-devel-20.6.0-2.1.aarch64.rpm"
RPM_HASH = "2aaceea86cea68d49ce411adc5c2b34269cfc4fc189fc185f74f3847dc53f8d16dc3bb46dd041ccef060467b3e3e84caf1bf7efb63c2043bae26212cdc2a3595"

RPROVIDES:${PN} += "nodejs-devel \
nodejs20-devel"

RDEPENDS:${PN} += "nodejs20 \
npm20"

inherit rpm
