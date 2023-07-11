SUMMARY = "Adds support for man pages to rubygems"
DESCRIPTION = "With this gem the rubygems command will detect man pages within gems and \
exposes them to the man command."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "ruby3.2-rubygem-manpages-0.6.1-1.17.aarch64.rpm"
RPM_HASH = "c5a3d74afca67164639c2ebcc2176cc4c2a080c6de8b3410919293c39ee71d42f85a26d36b514946d31e65a9e405b09f24ba14248ebc411391991c62bf346ddf"

RPROVIDES:${PN} += "ruby3.2-rubygem-manpages \
rubygem-manpages \
rubygem-ruby-3.2.0-manpages \
rubygem-ruby-3.2.0-manpages-0 \
rubygem-ruby-3.2.0-manpages-0.6 \
rubygem-ruby-3.2.0-manpages-0.6.1"

RDEPENDS:${PN} += "/usr/bin/bash \
ruby-abi"

inherit rpm
