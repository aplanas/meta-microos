SUMMARY = "Template compilation framework in Ruby"
DESCRIPTION = "Template compilation framework in Ruby."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "ruby3.2-rubygem-temple-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "ed8073171fb96c69f34f05c9fe298ba9835994aca10a348ee6a92c07df7397ae82bc40eb5117f72a608f27311b38aa63b9970c46926bf4551bb64f8f0c14d1d2"

RPROVIDES:${PN} += "ruby3.2-rubygem-temple \
ruby3.2-rubygem-temple(aarch-64) \
rubygem(ruby:3.2.0:temple) \
rubygem(ruby:3.2.0:temple:0) \
rubygem(ruby:3.2.0:temple:0.10) \
rubygem(ruby:3.2.0:temple:0.10.0) \
rubygem(temple)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
