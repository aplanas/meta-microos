SUMMARY = "A performance benchmarking library"
DESCRIPTION = "The Benchmark module provides methods for benchmarking Ruby code, giving \
detailed reports on the time taken for each task."
LICENSE = "BSD-2-Clause & Ruby"

PV = "0.2.1"

RPM_NAME = "ruby3.2-rubygem-benchmark-0.2.1-1.3.aarch64.rpm"
RPM_HASH = "9106b72bdcbe912f250b507988fd87468949394b18ec44539b090e05b5b9c6623baf7b24586b20a018e523c1b27e7afbee21bff3f5ca427cee94859efde05236"

RPROVIDES:${PN} += "ruby3.2-rubygem-benchmark \
ruby3.2-rubygem-benchmark(aarch-64) \
rubygem(benchmark) \
rubygem(ruby:3.2.0:benchmark) \
rubygem(ruby:3.2.0:benchmark:0) \
rubygem(ruby:3.2.0:benchmark:0.2) \
rubygem(ruby:3.2.0:benchmark:0.2.1)"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby3.2 \
ruby(abi)"

inherit rpm
