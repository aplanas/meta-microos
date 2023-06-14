SUMMARY = "A simple and reliable solution for controlling external programs"
DESCRIPTION = "This gem aims at being a simple and reliable solution for controlling external \
programs running in the background on any Ruby / OS combination."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "ruby3.2-rubygem-childprocess-4.1.0-1.11.aarch64.rpm"
RPM_HASH = "66468be4b4bdf2e2d2f2ed0c705667785caee997304e3c2b87ed933b8ea2d556084f927d6966c574880434efdf4e677bdefea66146d73ebe1e97076fab8c38fa"

RPROVIDES:${PN} += "ruby3.2-rubygem-childprocess \
rubygem-childprocess \
rubygem-ruby-3.2.0-childprocess \
rubygem-ruby-3.2.0-childprocess-4 \
rubygem-ruby-3.2.0-childprocess-4.1 \
rubygem-ruby-3.2.0-childprocess-4.1.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
