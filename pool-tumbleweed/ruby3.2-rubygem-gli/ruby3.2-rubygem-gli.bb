SUMMARY = "Build command-suite CLI apps that are awesome"
DESCRIPTION = "Build command-suite CLI apps that are awesome.  Bootstrap your app, add \
commands, options and documentation while maintaining a well-tested idiomatic \
command-line app."
LICENSE = "Apache-2.0"

PV = "2.21.0"

RPM_NAME = "ruby3.2-rubygem-gli-2.21.0-1.7.aarch64.rpm"
RPM_HASH = "88ba8e9f5a2801e5fb0660962fb07ce3a1c7796d853d13697586625f73eb1b6917d7d209a3c6bafccb113fc0ac4328d7bb143ff655c5ce919bf77782de150520"

RPROVIDES:${PN} += "ruby3.2-rubygem-gli \
rubygem-gli \
rubygem-ruby-3.2.0-gli \
rubygem-ruby-3.2.0-gli-2 \
rubygem-ruby-3.2.0-gli-2.21 \
rubygem-ruby-3.2.0-gli-2.21.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
update-alternatives"

inherit rpm
