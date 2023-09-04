SUMMARY = "Rails packaging support"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses. \
 \
Rails packaging support files."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "ruby-common-rails-3.2.1-2.1.noarch.rpm"
RPM_HASH = "333ddb5170fd654986e3a9ca3d3b36e6208707a53e05d009243ab187fbaed1efa51691e2c81b77838c9fc32c9e4f275c26ca02838b3d7645a27638228221c5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-rails-fix-ruby-shebang \
rpm-macro-rails-fix-ruby-suffix \
rpm-macro-rails-regen-gemfile-lock \
rpm-macro-rails-save-gemfile \
rpm-macro-rails-write-appinfo \
rpm-macro-ruby-fix-shebang \
ruby-common-rails"

RDEPENDS:${PN} += "/usr/bin/sh \
ruby-common \
rubygem-bundler"

inherit rpm
