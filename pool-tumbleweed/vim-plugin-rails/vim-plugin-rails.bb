SUMMARY = "Support for Ruby on Rails development"
DESCRIPTION = "This plugin offers the many features for Ruby on Rails application development."
LICENSE = "Vim"

PV = "5.2"

RPM_NAME = "vim-plugin-rails-5.2-56.1.noarch.rpm"
RPM_HASH = "9e62c34b0046ae6fdec69f9a637d42556b85028484a9ff99f8153e43c50f759f1033fc0917541cfcf930c902c8c6ecf54047aa61c07f5da1238f2a6fc5315df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-rails"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
