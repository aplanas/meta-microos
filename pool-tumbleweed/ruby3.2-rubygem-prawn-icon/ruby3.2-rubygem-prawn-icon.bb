SUMMARY = "Provides icon fonts for PrawnPDF"
DESCRIPTION = "Prawn::Icon provides various icon fonts including \
FontAwesome, PaymentFont and Foundation Icons \
for use with the Prawn PDF toolkit."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.1.0"

RPM_NAME = "ruby3.2-rubygem-prawn-icon-3.1.0-1.5.aarch64.rpm"
RPM_HASH = "5a4a02bcbc85721a1dd46a68e59f13d9a8688f5255941e216e2d10a739c7df65bbc8c7b8e9c4d1a48d12bf200fa51d646138dba66e17a63b6552e2518f20e990"

RPROVIDES:${PN} += "ruby3.2-rubygem-prawn-icon \
rubygem-prawn-icon \
rubygem-ruby-3.2.0-prawn-icon \
rubygem-ruby-3.2.0-prawn-icon-3 \
rubygem-ruby-3.2.0-prawn-icon-3.1 \
rubygem-ruby-3.2.0-prawn-icon-3.1.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-prawn"

inherit rpm
