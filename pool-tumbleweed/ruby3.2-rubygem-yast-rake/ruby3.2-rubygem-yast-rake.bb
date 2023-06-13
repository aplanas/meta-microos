SUMMARY = "Rake tasks providing basic work-flow for Yast development"
DESCRIPTION = "Rake tasks that support work-flow of Yast developer. It allows packaging repo, \
send it to build service, create submit request to target repo or run client \
from git repo."
LICENSE = "LGPL-2.1-only"

PV = "0.2.48"

RPM_NAME = "ruby3.2-rubygem-yast-rake-0.2.48-1.1.aarch64.rpm"
RPM_HASH = "6a3e3b82480d5c8e39aefa14a79d7fbdcd9cff7bd2b962278cb1280867f7e8c7e09da58d16aa910fce5923cdf121c830969b3af2e09c95b30e2b6b05023e8c37"

RPROVIDES:${PN} += "ruby3.2-rubygem-yast-rake \
ruby3.2-rubygem-yast-rake(aarch-64) \
rubygem(ruby:3.2.0:yast-rake) \
rubygem(ruby:3.2.0:yast-rake:0) \
rubygem(ruby:3.2.0:yast-rake:0.2) \
rubygem(ruby:3.2.0:yast-rake:0.2.48) \
rubygem(yast-rake)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:packaging_rake_tasks) \
rubygem(ruby:3.2.0:rake)"

inherit rpm
