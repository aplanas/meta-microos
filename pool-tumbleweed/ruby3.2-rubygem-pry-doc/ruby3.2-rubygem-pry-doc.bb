SUMMARY = "Provides YARD and extended documentation support for Pry"
DESCRIPTION = "Pry Doc is a Pry REPL plugin. It provides extended documentation support for \
the REPL by means of improving the `show-doc` and `show-source` commands. With help \
of the plugin the commands are be able to display the source code and the docs \
of Ruby methods and classes implemented in C."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "ruby3.2-rubygem-pry-doc-1.3.0-1.9.aarch64.rpm"
RPM_HASH = "0f5efd7f819a72126dbfe75887b034c163fef674f187d43a2cfe992b5fd4983250fc560a2ebdea4d0cf180814c83d7f24a59a18e03b44329636b7b8a94ed3371"

RPROVIDES:${PN} += "ruby3.2-rubygem-pry-doc \
rubygem-pry-doc \
rubygem-ruby-3.2.0-pry-doc \
rubygem-ruby-3.2.0-pry-doc-1 \
rubygem-ruby-3.2.0-pry-doc-1.3 \
rubygem-ruby-3.2.0-pry-doc-1.3.0"

RDEPENDS:${PN} += "etags \
ruby-abi \
rubygem-ruby-3.2.0-pry-0 \
rubygem-ruby-3.2.0-yard-0.9"

inherit rpm
