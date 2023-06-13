SUMMARY = "If you have a memory leak in your web code puma_worker_killer can"
DESCRIPTION = "Kills pumas, the code kind ."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "ruby3.2-rubygem-puma_worker_killer-0.3.1-1.15.aarch64.rpm"
RPM_HASH = "10c3a90a4a2e18bb83d742049fc475cf8ab292662451538ed6ec39e0a9d3c41fd80c2fdaf44c5f566f35d56942997733fdd4f4c16e48a2996fca35ce6c572850"

RPROVIDES:${PN} += "ruby3.2-rubygem-puma_worker_killer \
ruby3.2-rubygem-puma_worker_killer(aarch-64) \
rubygem(puma_worker_killer) \
rubygem(ruby:3.2.0:puma_worker_killer) \
rubygem(ruby:3.2.0:puma_worker_killer:0) \
rubygem(ruby:3.2.0:puma_worker_killer:0.3) \
rubygem(ruby:3.2.0:puma_worker_killer:0.3.1)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:get_process_mem:0) \
rubygem(ruby:3.2.0:puma)"

inherit rpm
