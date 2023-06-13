SUMMARY = "Ruby FFI Rakefile generator"
DESCRIPTION = "Ruby FFI library."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "ruby3.2-rubygem-ffi-compiler-1.0.1-1.11.aarch64.rpm"
RPM_HASH = "40ef17fa034ad41c9eddff7d8c42fc067d72a5f7a29fdf3ce836bb50c75ee310ec0c2168eb33f83c36106861258b2babd0e081456596ffdbd163eee5a79c0292"

RPROVIDES:${PN} += "ruby3.2-rubygem-ffi-compiler \
ruby3.2-rubygem-ffi-compiler(aarch-64) \
rubygem(ffi-compiler) \
rubygem(ruby:3.2.0:ffi-compiler) \
rubygem(ruby:3.2.0:ffi-compiler:1) \
rubygem(ruby:3.2.0:ffi-compiler:1.0) \
rubygem(ruby:3.2.0:ffi-compiler:1.0.1)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:ffi) \
rubygem(ruby:3.2.0:rake)"

inherit rpm
