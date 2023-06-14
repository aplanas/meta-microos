SUMMARY = "Builds manuals"
DESCRIPTION = "Ronn builds manuals. It converts simple, human readable textfiles to roff \
for terminal display, and also to HTML for the web."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "ruby3.2-rubygem-ronn-0.7.3-2.20.aarch64.rpm"
RPM_HASH = "f4a59100576756c2629ce4c3e3967b3fd4f95195224f16982451717f656b48a4b063bdbf9e7b36ed76ebbef42ba6598ddb6c47f000164254b5d9c7b2f60204b1"

RPROVIDES:${PN} += "ruby3.2-rubygem-ronn \
rubygem-ronn \
rubygem-ruby-3.2.0-ronn \
rubygem-ruby-3.2.0-ronn-0 \
rubygem-ruby-3.2.0-ronn-0.7 \
rubygem-ruby-3.2.0-ronn-0.7.3"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-hpricot \
rubygem-ruby-3.2.0-mustache \
rubygem-ruby-3.2.0-rdiscount \
update-alternatives"

inherit rpm
