SUMMARY = "Mocking and stubbing library"
DESCRIPTION = "Mocking and stubbing library with JMock/SchMock syntax, which allows mocking \
and stubbing of methods on real (non-mock) classes."
LICENSE = "BSD-2-Clause & MIT"

PV = "2.0.2"

RPM_NAME = "ruby3.2-rubygem-mocha-2.0.2-1.3.aarch64.rpm"
RPM_HASH = "7d095a5d6a5a77f8f21ac760b73fa7953a19fbf0c669a2ace74b06f88bd90a3208ca81012cda50412df24656bb7670ef0136b7b1f10e4f947ea31e908b7b7e1d"

RPROVIDES:${PN} += "ruby3.2-rubygem-mocha \
rubygem-mocha \
rubygem-ruby-3.2.0-mocha \
rubygem-ruby-3.2.0-mocha-2 \
rubygem-ruby-3.2.0-mocha-2.0 \
rubygem-ruby-3.2.0-mocha-2.0.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-ruby2-keywords"

inherit rpm
