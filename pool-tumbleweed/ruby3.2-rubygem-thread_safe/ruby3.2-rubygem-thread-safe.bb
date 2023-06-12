SUMMARY = "Thread-safe collections and utilities for Ruby"
DESCRIPTION = "A collection of data structures and utilities to make thread-safe programming \
in Ruby easier."
LICENSE = "Apache-2.0"

PV = "0.3.6"

RPM_NAME = "ruby3.2-rubygem-thread_safe-0.3.6-1.28.aarch64.rpm"
RPM_HASH = "8b3cbfdb6975603592ec18a005da6664237d22c2e8365a4fb9bca514292495dbaefdef8bf80be93629770b5cab99633f5876b8ecf83e11955ad173d528cc2f85"

RPROVIDES:${PN} += "ruby3.2-rubygem-thread_safe \
ruby3.2-rubygem-thread_safe(aarch-64) \
rubygem(ruby:3.2.0:thread_safe) \
rubygem(ruby:3.2.0:thread_safe:0) \
rubygem(ruby:3.2.0:thread_safe:0.3) \
rubygem(ruby:3.2.0:thread_safe:0.3.6) \
rubygem(thread_safe)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ruby(abi)"

inherit rpm
