SUMMARY = "Determines the monospace display width of a string in Ruby"
DESCRIPTION = "[Unicode 15.0.0] Determines the monospace display width of a string using \
EastAsianWidth.txt, Unicode general category, and other data."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ruby3.2-rubygem-unicode-display_width-2.3.0-1.5.aarch64.rpm"
RPM_HASH = "a674cdd8e4954a7dab00489c777ed675ae6174649fd3a85c69939e7621e755e6b4a92f48e69123978a7bc4c3729bc3506f406d6011a666c07afd7bbd4648a9f0"

RPROVIDES:${PN} += "ruby3.2-rubygem-unicode-display_width \
ruby3.2-rubygem-unicode-display_width(aarch-64) \
rubygem(ruby:3.2.0:unicode-display_width) \
rubygem(ruby:3.2.0:unicode-display_width:2) \
rubygem(ruby:3.2.0:unicode-display_width:2.3) \
rubygem(ruby:3.2.0:unicode-display_width:2.3.0) \
rubygem(unicode-display_width)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
