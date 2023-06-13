SUMMARY = "Rake tasks providing tasks to package project in git and integration"
DESCRIPTION = "Rake tasks to allow easy packaging ruby projects in git for Build Service or \
other packaging service."
LICENSE = "LGPL-2.1-only"

PV = "1.5.3"

RPM_NAME = "ruby3.2-rubygem-packaging_rake_tasks-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "96e669984e2a2fd211b1bd13ade7347944dd861121ba891166cb25e41de22ec8fde77de59c9422947c18fa076ab932f41f28819134a6e9ab9fec1b4e6d5a4a36"

RPROVIDES:${PN} += "ruby3.2-rubygem-packaging_rake_tasks \
ruby3.2-rubygem-packaging_rake_tasks(aarch-64) \
rubygem(packaging_rake_tasks) \
rubygem(ruby:3.2.0:packaging_rake_tasks) \
rubygem(ruby:3.2.0:packaging_rake_tasks:1) \
rubygem(ruby:3.2.0:packaging_rake_tasks:1.5) \
rubygem(ruby:3.2.0:packaging_rake_tasks:1.5.3)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:rake)"

inherit rpm
