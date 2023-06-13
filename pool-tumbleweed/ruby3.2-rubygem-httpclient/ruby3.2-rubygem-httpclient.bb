SUMMARY = "gives something like the functionality of libwww-perl (LWP) in Ruby"
DESCRIPTION = "gives something like the functionality of libwww-perl (LWP) in Ruby."
LICENSE = "Ruby"

PV = "2.8.3"

RPM_NAME = "ruby3.2-rubygem-httpclient-2.8.3-1.31.aarch64.rpm"
RPM_HASH = "9ff1a0d5bd2b4bfb30f0c40c258c16aefc2d126127489af0cfbf9854ac356f24bc1daca5a4007ff2910117b2b2513146b4488059c99bcd735e804c618b039e6b"

RPROVIDES:${PN} += "ruby3.2-rubygem-httpclient \
ruby3.2-rubygem-httpclient(aarch-64) \
rubygem(httpclient) \
rubygem(ruby:3.2.0:httpclient) \
rubygem(ruby:3.2.0:httpclient:2) \
rubygem(ruby:3.2.0:httpclient:2.8) \
rubygem(ruby:3.2.0:httpclient:2.8.3)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
update-alternatives"

inherit rpm
