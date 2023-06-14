SUMMARY = "Hoe is a rake/rubygems helper for project Rakefiles"
DESCRIPTION = "Hoe is a rake/rubygems helper for project Rakefiles. It helps you \
manage, maintain, and release your project and includes a dynamic \
plug-in system allowing for easy extensibility. Hoe ships with \
plug-ins for all your usual project tasks including rdoc generation, \
testing, packaging, deployment, and announcement. \
See class rdoc for help. Hint: `ri Hoe` or any of the plugins listed \
below. \
For extra goodness, see: http://docs.seattlerb.org/hoe/Hoe.pdf."
LICENSE = "MIT"

PV = "3.26.0"

RPM_NAME = "ruby3.2-rubygem-hoe-3.26.0-1.6.aarch64.rpm"
RPM_HASH = "905adc69f0556925fb4d1a9df3c991cdb4128f83d2121d751358b08db80a4d330fa95123467faf99b33b5a0d9ebf9e6903a25b6a3767aff178c7dc5cd8005250"

RPROVIDES:${PN} += "ruby3.2-rubygem-hoe \
rubygem-hoe \
rubygem-ruby-3.2.0-hoe \
rubygem-ruby-3.2.0-hoe-3 \
rubygem-ruby-3.2.0-hoe-3.26 \
rubygem-ruby-3.2.0-hoe-3.26.0"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-rake \
update-alternatives"

inherit rpm
