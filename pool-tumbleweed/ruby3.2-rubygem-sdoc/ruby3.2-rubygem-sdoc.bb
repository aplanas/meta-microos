SUMMARY = "rdoc html with javascript search index"
DESCRIPTION = "rdoc generator html with javascript search index."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby3.2-rubygem-sdoc-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "666790b1b4761d3cd01feb7c28723500c4fcc88f1f18da1002202ca00d6b6458f6e1d4e93b2f9fe4a97c88dc69309775cbed1ab92534b2893c9dcce0f15f3269"

RPROVIDES:${PN} += "ruby3.2-rubygem-sdoc \
rubygem-ruby-3.2.0-sdoc \
rubygem-ruby-3.2.0-sdoc-2 \
rubygem-ruby-3.2.0-sdoc-2.4 \
rubygem-ruby-3.2.0-sdoc-2.4.0 \
rubygem-sdoc"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-rdoc \
update-alternatives"

inherit rpm
