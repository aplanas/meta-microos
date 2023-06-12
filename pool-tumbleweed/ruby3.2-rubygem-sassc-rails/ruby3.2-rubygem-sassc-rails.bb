SUMMARY = "Integrate SassC-Ruby into Rails"
DESCRIPTION = "We all love working with Sass, but compilation can take quite a long time for larger codebases. This gem integrates the C implementation of Sass, LibSass, into the asset pipeline."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "ruby3.2-rubygem-sassc-rails-2.1.2-1.17.aarch64.rpm"
RPM_HASH = "e2daa0039d60a15fa69c1957a87bb2eb8b9ecda269e40110bda09b2770daf5a44419dff5a418dd903f2426b4a74305346abf76ef4dbcfe440794edccf78fdb6f"

RPROVIDES:${PN} += "ruby3.2-rubygem-sassc-rails \
ruby3.2-rubygem-sassc-rails(aarch-64) \
rubygem(ruby:3.2.0:sassc-rails) \
rubygem(ruby:3.2.0:sassc-rails:2) \
rubygem(ruby:3.2.0:sassc-rails:2.1) \
rubygem(ruby:3.2.0:sassc-rails:2.1.2) \
rubygem(sassc-rails)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:railties) \
rubygem(ruby:3.2.0:sassc) \
rubygem(ruby:3.2.0:sprockets) \
rubygem(ruby:3.2.0:sprockets-rails) \
rubygem(ruby:3.2.0:tilt)"

inherit rpm
