SUMMARY = "Simple and easy way to know if you're on windows or not (reliably),"
DESCRIPTION = "The OS gem allows for some useful and easy functions, like OS.windows? (=> \
true or false) OS.bits ( => 32 or 64) etc'."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "ruby3.2-rubygem-os-1.1.4-1.10.aarch64.rpm"
RPM_HASH = "dd34512df75a785404cd4cb5b68e2e8f6b5a62ba035dd73c852c6fc36bd9aa8e30749791e01a3b197b761deb0b5fcfd4dc12585c8e277440a81c7b42c109a66c"

RPROVIDES:${PN} += "ruby3.2-rubygem-os \
rubygem-os \
rubygem-ruby-3.2.0-os \
rubygem-ruby-3.2.0-os-1 \
rubygem-ruby-3.2.0-os-1.1 \
rubygem-ruby-3.2.0-os-1.1.4"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
