SUMMARY = "Augment 'require' to load non-Ruby file types"
DESCRIPTION = "The Polyglot library allows a Ruby module to register a loader \
for the file type associated with a filename extension, and it \
augments 'require' to find and load matching files."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "ruby3.2-rubygem-polyglot-0.3.5-1.32.aarch64.rpm"
RPM_HASH = "1dfe963a54dc238ade8a881c33e7b691456fead4d073b0ae6fabb9bac0a3633e5d6ad0185ed9ef5a8092543713f6495c7901b74d0097dcb7c8dc95d7a7cbc994"

RPROVIDES:${PN} += "ruby3.2-rubygem-polyglot \
rubygem-polyglot \
rubygem-ruby-3.2.0-polyglot \
rubygem-ruby-3.2.0-polyglot-0 \
rubygem-ruby-3.2.0-polyglot-0.3 \
rubygem-ruby-3.2.0-polyglot-0.3.5"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
