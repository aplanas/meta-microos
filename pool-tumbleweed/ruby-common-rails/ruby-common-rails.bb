SUMMARY = "Rails packaging support"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses. \
 \
Rails packaging support files."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "ruby-common-rails-3.2.1-1.1.noarch.rpm"
RPM_HASH = "4fd5ac8caeb9b6a4bd4321211db1037718e39dd1dfd880b6856f219c3e810b7565fda8d3922c4a8a0894ee28fe82f8a1c414da19a9941bfd9dd7646599134499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(rails_fix_ruby_shebang) \
rpm_macro(rails_fix_ruby_suffix) \
rpm_macro(rails_regen_gemfile_lock) \
rpm_macro(rails_save_gemfile) \
rpm_macro(rails_write_appinfo) \
rpm_macro(ruby_fix_shebang) \
ruby-common-rails"

RDEPENDS:${PN} += "/bin/sh \
ruby-common \
rubygem(bundler)"

inherit rpm
