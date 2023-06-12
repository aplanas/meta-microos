SUMMARY = "Multipurpose Internet Mail Extensions (MIME) Library"
DESCRIPTION = "A library for building RFC compliant Multipurpose Internet Mail Extensions \
(MIME) messages. It can be used to construct standardized MIME messages for \
use \
in client/server communications, such as Internet mail or HTTP \
multipart/form-data transactions."
LICENSE = "ISC"

PV = "0.4.4"

RPM_NAME = "ruby3.2-rubygem-mime-0.4.4-1.15.aarch64.rpm"
RPM_HASH = "77c2cd18c1e4e67a1b68775806acb4846bf4ade3e0f392e553909989a57d9547391783aef2582329908a4d4747310338e8f6f0f94367be19509c3c44e525fab0"

RPROVIDES:${PN} += "ruby3.2-rubygem-mime \
ruby3.2-rubygem-mime(aarch-64) \
rubygem(mime) \
rubygem(ruby:3.2.0:mime) \
rubygem(ruby:3.2.0:mime:0) \
rubygem(ruby:3.2.0:mime:0.4) \
rubygem(ruby:3.2.0:mime:0.4.4)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
