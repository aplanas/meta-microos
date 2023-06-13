SUMMARY = "ServerEngine - multiprocess server framework"
DESCRIPTION = "A framework to implement robust multiprocess servers like Unicorn."
LICENSE = "Apache-2.0"

PV = "2.3.0"

RPM_NAME = "ruby3.2-rubygem-serverengine-2.3.0-1.5.aarch64.rpm"
RPM_HASH = "c8a95b19ca78953c77630e95dad8879d098cc21903a599524c28d1c479c541d2463d66caaf0e4c60a38c37cce10cc5ae23b6d07700b9aff32b9943c85367ad4b"

RPROVIDES:${PN} += "ruby3.2-rubygem-serverengine \
ruby3.2-rubygem-serverengine(aarch-64) \
rubygem(ruby:3.2.0:serverengine) \
rubygem(ruby:3.2.0:serverengine:2) \
rubygem(ruby:3.2.0:serverengine:2.3) \
rubygem(ruby:3.2.0:serverengine:2.3.0) \
rubygem(serverengine)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:sigdump:0.2)"

inherit rpm
