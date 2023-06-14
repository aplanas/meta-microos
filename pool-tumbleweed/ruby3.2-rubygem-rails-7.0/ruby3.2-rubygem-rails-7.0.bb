SUMMARY = "Full-stack web application framework"
DESCRIPTION = "Ruby on Rails is a full-stack web framework optimized for programmer happiness \
and sustainable productivity. It encourages beautiful code by favoring \
convention over configuration."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-rails-7.0-7.0.4.3-2.1.aarch64.rpm"
RPM_HASH = "dd4ad69bc65c092216f95940c10f20dfb17380046fd72e256de3f5be73222e55adb6e71407bc7ea916e0e43e7bff155e48371caabc27da4fa7e8eec92328227a"

RPROVIDES:${PN} += "ruby3.2-rubygem-rails-7.0 \
rubygem-rails \
rubygem-ruby-3.2.0-rails \
rubygem-ruby-3.2.0-rails-7 \
rubygem-ruby-3.2.0-rails-7.0 \
rubygem-ruby-3.2.0-rails-7.0.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-actioncable \
rubygem-ruby-3.2.0-actionmailbox \
rubygem-ruby-3.2.0-actionmailer \
rubygem-ruby-3.2.0-actionpack \
rubygem-ruby-3.2.0-actiontext \
rubygem-ruby-3.2.0-actionview \
rubygem-ruby-3.2.0-activejob \
rubygem-ruby-3.2.0-activemodel \
rubygem-ruby-3.2.0-activerecord \
rubygem-ruby-3.2.0-activestorage \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-bootsnap \
rubygem-ruby-3.2.0-bundler \
rubygem-ruby-3.2.0-importmap-rails \
rubygem-ruby-3.2.0-jbuilder \
rubygem-ruby-3.2.0-puma-5 \
rubygem-ruby-3.2.0-railties \
rubygem-ruby-3.2.0-sprockets \
rubygem-ruby-3.2.0-sprockets-rails \
rubygem-ruby-3.2.0-sqlite3-1 \
rubygem-ruby-3.2.0-stimulus-rails \
rubygem-ruby-3.2.0-turbo-rails \
rubygem-ruby-3.2.0-web-console"

inherit rpm
