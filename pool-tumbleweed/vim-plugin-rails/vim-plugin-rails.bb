SUMMARY = "Support for Ruby on Rails development"
DESCRIPTION = "This plugin offers the many features for Ruby on Rails application development."
LICENSE = "Vim"

PV = "5.2"

RPM_NAME = "vim-plugin-rails-5.2-55.1.noarch.rpm"
RPM_HASH = "9af78c0d2e32b61a71c1ab28ee863593b499280f789b6c6906694cabd40985c9b82939c20c915ca02c31bdea5f1ad9de5f88b149ff6d3afdf604bbacc39933cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-rails"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
