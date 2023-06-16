SUMMARY = "Ruby fast debugger - base + CLI"
DESCRIPTION = "Byebug is a Ruby debugger. It's implemented using the \
TracePoint C API for execution control and the Debug Inspector C API for \
call stack navigation.  The core component provides support that front-ends \
can build on. It provides breakpoint handling and bindings for stack frames \
among other things and it comes with an easy to use command line interface."
LICENSE = "BSD-2-Clause"

PV = "11.1.3"

RPM_NAME = "ruby3.2-rubygem-byebug-11.1.3-1.22.aarch64.rpm"
RPM_HASH = "8edfc9eda681cd9ce3d4867d4d0ca2e8b70872e992d9f4e8a39358c3963658bd04a56850e7692b1fe755d3c805e36b86a3901b97ae42f63b006be28c95f9cafa"

RPROVIDES:${PN} += "ruby3.2-rubygem-byebug \
rubygem-byebug \
rubygem-ruby-3.2.0-byebug \
rubygem-ruby-3.2.0-byebug-11 \
rubygem-ruby-3.2.0-byebug-11.1 \
rubygem-ruby-3.2.0-byebug-11.1.3"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi \
update-alternatives"

inherit rpm
