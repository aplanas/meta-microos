SUMMARY = "Colorize your text in the terminal"
DESCRIPTION = "Colorize your text in the terminal."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby3.2-rubygem-colorator-1.1.0-1.29.aarch64.rpm"
RPM_HASH = "9507ab252ed81b562340a368af2efac36f73ec5d5fbfd531538d168f7552f410be1a190b9b67c791da28aadb5068c20bc9a7fd93b6a0768406ebb0755511fe21"

RPROVIDES:${PN} += "ruby3.2-rubygem-colorator \
rubygem-colorator \
rubygem-ruby-3.2.0-colorator \
rubygem-ruby-3.2.0-colorator-1 \
rubygem-ruby-3.2.0-colorator-1.1 \
rubygem-ruby-3.2.0-colorator-1.1.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
