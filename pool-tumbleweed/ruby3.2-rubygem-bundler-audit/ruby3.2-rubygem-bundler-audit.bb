SUMMARY = "Patch-level verification for Bundler"
DESCRIPTION = "bundler-audit provides patch-level verification for Bundled apps."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "ruby3.2-rubygem-bundler-audit-0.9.1-1.7.aarch64.rpm"
RPM_HASH = "aeef5e0094d9059a2e44bc88af4c490b7d19a1c978a1ab6619e490935f3734282837e77d62d4d1ce13d5ab1856583e74358ca56659bc22af604600a182eca7d2"

RPROVIDES:${PN} += "ruby3.2-rubygem-bundler-audit \
ruby3.2-rubygem-bundler-audit(aarch-64) \
rubygem(bundler-audit) \
rubygem(ruby:3.2.0:bundler-audit) \
rubygem(ruby:3.2.0:bundler-audit:0) \
rubygem(ruby:3.2.0:bundler-audit:0.9) \
rubygem(ruby:3.2.0:bundler-audit:0.9.1)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:bundler) \
rubygem(ruby:3.2.0:thor:1) \
update-alternatives"

inherit rpm
