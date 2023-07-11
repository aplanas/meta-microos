SUMMARY = "Rake tasks providing basic work-flow for Yast development"
DESCRIPTION = "Rake tasks that support work-flow of Yast developer. It allows packaging repo, \
send it to build service, create submit request to target repo or run client \
from git repo."
LICENSE = "LGPL-2.1-only"

PV = "0.2.48"

RPM_NAME = "ruby3.2-rubygem-yast-rake-0.2.48-1.2.aarch64.rpm"
RPM_HASH = "445b155ff7ad7ce4f352def1380c26dd253bf91089a603b224b78152b52c41abe29514f5b27a6b9d51d6925c09222f32bd30f605950ba464f2e8924b0cbfafb1"

RPROVIDES:${PN} += "ruby3.2-rubygem-yast-rake \
rubygem-ruby-3.2.0-yast-rake \
rubygem-ruby-3.2.0-yast-rake-0 \
rubygem-ruby-3.2.0-yast-rake-0.2 \
rubygem-ruby-3.2.0-yast-rake-0.2.48 \
rubygem-yast-rake"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-packaging-rake-tasks \
rubygem-ruby-3.2.0-rake"

inherit rpm
