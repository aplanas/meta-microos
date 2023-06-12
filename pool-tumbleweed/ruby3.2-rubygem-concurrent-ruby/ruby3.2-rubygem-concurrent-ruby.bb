SUMMARY = "Modern concurrency tools for Ruby. Inspired by Erlang, Clojure,"
DESCRIPTION = "Modern concurrency tools including agents, futures, promises, thread pools, \
actors, supervisors, and more. \
Inspired by Erlang, Clojure, Go, JavaScript, actors, and classic concurrency \
patterns."
LICENSE = "MIT"

PV = "1.1.10"

RPM_NAME = "ruby3.2-rubygem-concurrent-ruby-1.1.10-1.7.aarch64.rpm"
RPM_HASH = "b2f738ecccfe4a9b1f924c9eedccffe7a5f917143bb3108a9bc137f8aa002e6d26d1dfa771ad637628bfcf926d092ec33725f57d401499e73f9e738870574fd3"

RPROVIDES:${PN} += "ruby3.2-rubygem-concurrent-ruby \
ruby3.2-rubygem-concurrent-ruby(aarch-64) \
rubygem(concurrent-ruby) \
rubygem(ruby:3.2.0:concurrent-ruby) \
rubygem(ruby:3.2.0:concurrent-ruby:1) \
rubygem(ruby:3.2.0:concurrent-ruby:1.1) \
rubygem(ruby:3.2.0:concurrent-ruby:1.1.10)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
