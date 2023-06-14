SUMMARY = "Ruby & C implementation of Jaro-Winkler distance algorithm which supports UTF-8 string"
DESCRIPTION = "jaro_winkler is an implementation of Jaro-Winkler distance algorithm which is \
written in C extension and will fallback to pure Ruby version in platforms \
other than MRI/KRI like JRuby or Rubinius. Both of C and Ruby implementation \
support any kind of string encoding, such as UTF-8, EUC-JP, Big5, etc."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "ruby3.2-rubygem-jaro_winkler-1.5.4-1.21.aarch64.rpm"
RPM_HASH = "c75718fa7fca93e8ba86ce6a97cac233f54d0cf8082a577e69e4272c699004ee3faa384f9e80384a0ab5d81f4ad027aa3cdb074ad802933fd443951c536466f2"

RPROVIDES:${PN} += "ruby3.2-rubygem-jaro-winkler \
rubygem-jaro-winkler \
rubygem-ruby-3.2.0-jaro-winkler \
rubygem-ruby-3.2.0-jaro-winkler-1 \
rubygem-ruby-3.2.0-jaro-winkler-1.5 \
rubygem-ruby-3.2.0-jaro-winkler-1.5.4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
