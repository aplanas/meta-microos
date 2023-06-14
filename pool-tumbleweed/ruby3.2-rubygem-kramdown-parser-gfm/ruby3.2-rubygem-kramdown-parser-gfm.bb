SUMMARY = "kramdown-parser-gfm provides a kramdown parser for the GFM dialect"
DESCRIPTION = "kramdown-parser-gfm provides a kramdown parser for the GFM dialect of \
Markdown."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby3.2-rubygem-kramdown-parser-gfm-1.1.0-1.13.aarch64.rpm"
RPM_HASH = "ee50197807601e499f44581c4453d15a58107eb0148d6049ff5028345d30418cfdc51d6397b09ce3f3b9b9784dc169959f131fd1b3599b131c3930563f18c499"

RPROVIDES:${PN} += "ruby3.2-rubygem-kramdown-parser-gfm \
rubygem-kramdown-parser-gfm \
rubygem-ruby-3.2.0-kramdown-parser-gfm \
rubygem-ruby-3.2.0-kramdown-parser-gfm-1 \
rubygem-ruby-3.2.0-kramdown-parser-gfm-1.1 \
rubygem-ruby-3.2.0-kramdown-parser-gfm-1.1.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-kramdown-2"

inherit rpm
