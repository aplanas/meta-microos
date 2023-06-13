SUMMARY = "Simple testing API built on Rack"
DESCRIPTION = "Rack::Test is a small, simple testing API for Rack apps. It can be used on its \
own or as a reusable starting point for Web frameworks and testing libraries \
to build on. Most of its initial functionality is an extraction of Merb 1.0's \
request helpers feature."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "ruby3.2-rubygem-rack-test-0_6-0.6.3-1.32.aarch64.rpm"
RPM_HASH = "1badc972de95723cd14bcc04bc149c28b6e9f6a84815a17660b6dafa30f9d306cd6eb8938e12f4d347256061a408b62965cbd9d02dc6178ea84b166a3115e05a"

RPROVIDES:${PN} += "ruby3.2-rubygem-rack-test-0_6 \
ruby3.2-rubygem-rack-test-0_6(aarch-64) \
rubygem(rack-test) \
rubygem(ruby:3.2.0:rack-test) \
rubygem(ruby:3.2.0:rack-test:0) \
rubygem(ruby:3.2.0:rack-test:0.6) \
rubygem(ruby:3.2.0:rack-test:0.6.3)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:rack)"

inherit rpm
