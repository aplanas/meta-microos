SUMMARY = "Adds support for man pages to rubygems"
DESCRIPTION = "With this gem the rubygems command will detect man pages within gems and \
exposes them to the man command."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "ruby3.2-rubygem-manpages-0.6.1-1.16.aarch64.rpm"
RPM_HASH = "291d0ff572dcc1971ca40b4ab039734229e8b2b12122a7ed0b87c828a8a35c3cb6dc109b830851a2689ce528be0ddd3a25927421fcae3589236c9b3a784b6542"

RPROVIDES:${PN} += "ruby3.2-rubygem-manpages \
ruby3.2-rubygem-manpages(aarch-64) \
rubygem(manpages) \
rubygem(ruby:3.2.0:manpages) \
rubygem(ruby:3.2.0:manpages:0) \
rubygem(ruby:3.2.0:manpages:0.6) \
rubygem(ruby:3.2.0:manpages:0.6.1)"
RDEPENDS:${PN} += "/bin/bash \
ruby(abi)"

inherit rpm
