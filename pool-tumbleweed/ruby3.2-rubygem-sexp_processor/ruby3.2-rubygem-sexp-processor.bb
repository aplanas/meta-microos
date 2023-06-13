SUMMARY = "sexp_processor branches from ParseTree bringing all the generic sexp"
DESCRIPTION = "sexp_processor branches from ParseTree bringing all the generic sexp \
processing tools with it. Sexp, SexpProcessor, Environment, etc... all \
for your language processing pleasure."
LICENSE = "MIT"

PV = "4.16.1"

RPM_NAME = "ruby3.2-rubygem-sexp_processor-4.16.1-1.8.aarch64.rpm"
RPM_HASH = "b99033b67bd7ef2ecc6cab1de8cb48dc09ea361640d2ddf83667f6ce2b60a4edc186438ea82a8be799d10f957a9860ac6c6c699881083fb8e8712e7c3a68225f"

RPROVIDES:${PN} += "ruby3.2-rubygem-sexp_processor \
ruby3.2-rubygem-sexp_processor(aarch-64) \
rubygem(ruby:3.2.0:sexp_processor) \
rubygem(ruby:3.2.0:sexp_processor:4) \
rubygem(ruby:3.2.0:sexp_processor:4.16) \
rubygem(ruby:3.2.0:sexp_processor:4.16.1) \
rubygem(sexp_processor)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
