SUMMARY = "Rake tasks providing tasks to package project in git and integration"
DESCRIPTION = "Rake tasks to allow easy packaging ruby projects in git for Build Service or \
other packaging service."
LICENSE = "LGPL-2.1-only"

PV = "1.5.4"

RPM_NAME = "ruby3.2-rubygem-packaging_rake_tasks-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "ef9d655ff5156837f8d04ed26a64b362fee58d51765df97e512975f8ca743e56e4cace3bf0201e0724ef8a56a10c32396a4d74fec5cd88c837fbfa4a29bf1f54"

RPROVIDES:${PN} += "ruby3.2-rubygem-packaging-rake-tasks \
rubygem-packaging-rake-tasks \
rubygem-ruby-3.2.0-packaging-rake-tasks \
rubygem-ruby-3.2.0-packaging-rake-tasks-1 \
rubygem-ruby-3.2.0-packaging-rake-tasks-1.5 \
rubygem-ruby-3.2.0-packaging-rake-tasks-1.5.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-rake"

inherit rpm
