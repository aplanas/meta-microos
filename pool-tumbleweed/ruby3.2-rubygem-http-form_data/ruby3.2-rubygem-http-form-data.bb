SUMMARY = "http-form_data-2.3.0"
DESCRIPTION = "Utility-belt to build form data request bodies. Provides support for \
`application/x-www-form-urlencoded` and `multipart/form-data` types."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ruby3.2-rubygem-http-form_data-2.3.0-1.11.aarch64.rpm"
RPM_HASH = "1f30740e9d2b48b574639320b3a8eea3ac7051641566fda0f98a52736162141cfd3463d3b827cc3b8fa0034875d889b7314eb29c44240f504945b3f82a3cf327"

RPROVIDES:${PN} += "ruby3.2-rubygem-http-form-data \
rubygem-http-form-data \
rubygem-ruby-3.2.0-http-form-data \
rubygem-ruby-3.2.0-http-form-data-2 \
rubygem-ruby-3.2.0-http-form-data-2.3 \
rubygem-ruby-3.2.0-http-form-data-2.3.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
