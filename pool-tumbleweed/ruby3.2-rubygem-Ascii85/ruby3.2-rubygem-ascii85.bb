SUMMARY = "Ascii85 encoder/decoder"
DESCRIPTION = "Ascii85 provides methods to encode/decode Adobe's binary-to-text encoding of \
the same name."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby3.2-rubygem-Ascii85-1.1.0-1.14.aarch64.rpm"
RPM_HASH = "ad0792b442a5148d5cd3e3fdd2a1e5e7bd4cbe292c9ed5bb3b3cae378946eb9fb89b2843a1d4001ee3e9f7c3e0e74d25a192086c3381648a3407c6cd1edeb811"

RPROVIDES:${PN} += "ruby3.2-rubygem-Ascii85 \
ruby3.2-rubygem-Ascii85(aarch-64) \
rubygem(Ascii85) \
rubygem(ruby:3.2.0:Ascii85) \
rubygem(ruby:3.2.0:Ascii85:1) \
rubygem(ruby:3.2.0:Ascii85:1.1) \
rubygem(ruby:3.2.0:Ascii85:1.1.0)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
update-alternatives"

inherit rpm
