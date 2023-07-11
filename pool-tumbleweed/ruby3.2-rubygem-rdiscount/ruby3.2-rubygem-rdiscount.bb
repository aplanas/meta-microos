SUMMARY = "Fast Implementation of Gruber's Markdown in C"
DESCRIPTION = "Fast Implementation of Gruber's Markdown in C."
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "ruby3.2-rubygem-rdiscount-2.2.7-1.8.aarch64.rpm"
RPM_HASH = "ba7f406a8434fe8ed71937314ebfcd0153ce00bd84207ffb13f5348df7c985fd23c1656225740d0cbd822045d93e4ea7572a8751237c592b1c3cc98c3d59d121"

RPROVIDES:${PN} += "ruby3.2-rubygem-rdiscount \
rubygem-rdiscount \
rubygem-ruby-3.2.0-rdiscount \
rubygem-ruby-3.2.0-rdiscount-2 \
rubygem-ruby-3.2.0-rdiscount-2.2 \
rubygem-ruby-3.2.0-rdiscount-2.2.7"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi \
update-alternatives"

inherit rpm
