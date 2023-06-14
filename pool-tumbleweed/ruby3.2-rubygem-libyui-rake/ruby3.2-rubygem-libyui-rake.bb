SUMMARY = "Rake tasks that provide basic workflow for libyui development"
DESCRIPTION = "Rake tasks that support the workflow of a libyui developer. It allows \
packaging \
a repo, sending it to the build service, creating a submit request to the \
target repo or running the client from the git repo. \
Heavily inspired by yast-rake."
LICENSE = "LGPL-2.1-only"

PV = "0.1.24"

RPM_NAME = "ruby3.2-rubygem-libyui-rake-0.1.24-1.8.aarch64.rpm"
RPM_HASH = "e2197341429219aded39296ed55483361cfdbe3abcc00dd9d77e7c3de3586d957a2a1cb462a1bd0d5ff5b06c7ae4a87cb3f11fff649392ca49d08cda181d16cc"

RPROVIDES:${PN} += "ruby3.2-rubygem-libyui-rake \
rubygem-libyui-rake \
rubygem-ruby-3.2.0-libyui-rake \
rubygem-ruby-3.2.0-libyui-rake-0 \
rubygem-ruby-3.2.0-libyui-rake-0.1 \
rubygem-ruby-3.2.0-libyui-rake-0.1.24"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-packaging-rake-tasks-1 \
rubygem-ruby-3.2.0-rake"

inherit rpm
