SUMMARY = "A secure, non-evaling end user template engine with aesthetic markup"
DESCRIPTION = "A secure, non-evaling end user template engine with aesthetic markup."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "ruby3.2-rubygem-liquid-4-4.0.3-1.13.aarch64.rpm"
RPM_HASH = "752df06e457daef0c1c89ecc8be5c38912e793a08a09d91e45cbb810996b7f46b602befa3c602a9929aeff413cf03510a874b2742536d7d445143edef3fccab9"

RPROVIDES:${PN} += "ruby3.2-rubygem-liquid-4 \
rubygem-liquid \
rubygem-ruby-3.2.0-liquid \
rubygem-ruby-3.2.0-liquid-4 \
rubygem-ruby-3.2.0-liquid-4.0 \
rubygem-ruby-3.2.0-liquid-4.0.3"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
