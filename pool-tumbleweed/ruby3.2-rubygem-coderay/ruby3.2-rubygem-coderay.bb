SUMMARY = "Fast syntax highlighting for selected languages"
DESCRIPTION = "Fast and easy syntax highlighting for selected languages, written in Ruby. \
Comes with RedCloth integration and LOC counter."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "ruby3.2-rubygem-coderay-1.1.3-1.17.aarch64.rpm"
RPM_HASH = "7a08a58e4aff1b24332fcdbea63c6bd50b3bb27e6949b9ebf081e8f03f7f50b8426d9dc96268ad93f99fc287a4ad1e2787c7f6534e790c6a78bc5b80ac5818d3"

RPROVIDES:${PN} += "ruby3.2-rubygem-coderay \
ruby3.2-rubygem-coderay(aarch-64) \
rubygem(coderay) \
rubygem(ruby:3.2.0:coderay) \
rubygem(ruby:3.2.0:coderay:1) \
rubygem(ruby:3.2.0:coderay:1.1) \
rubygem(ruby:3.2.0:coderay:1.1.3)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
update-alternatives"

inherit rpm
