SUMMARY = "A fast, high resolution timer library for recording peformance"
DESCRIPTION = "A fast, high resolution timer library for recording peformance metrics. * \
(http://github.com/copiousfreetime/hitimes) * \
(http://github.com/copiousfreetime/hitimes) * email jeremy at copiousfreetime \
dot org * `git clone url git://github.com/copiousfreetime/hitimes.git`."
LICENSE = "ISC"

PV = "2.0.0"

RPM_NAME = "ruby3.2-rubygem-hitimes-2.0.0-1.17.aarch64.rpm"
RPM_HASH = "9716c8035e7420d896a97a2a32746e69a217cf178ee15041662716b14c924b191ee3ccd871f0291f8d1ffd64baf078cd8b9251f469f42efdf452f575b0fd3aca"

RPROVIDES:${PN} += "ruby3.2-rubygem-hitimes \
rubygem-hitimes \
rubygem-ruby-3.2.0-hitimes \
rubygem-ruby-3.2.0-hitimes-2 \
rubygem-ruby-3.2.0-hitimes-2.0 \
rubygem-ruby-3.2.0-hitimes-2.0.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
