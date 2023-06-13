SUMMARY = "attr_required and attr_optional"
DESCRIPTION = "attr_required and attr_optional."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "ruby3.2-rubygem-attr_required-1.0.1-1.24.aarch64.rpm"
RPM_HASH = "f1289dba03c46bc2f29032ad5acd8170290c51eddf3236dd112d863fdce13f2e564a30d2f43e2ef0c39e5fb83573f9cc2b0e74a2e1d214d76cded66ec6619d34"

RPROVIDES:${PN} += "ruby3.2-rubygem-attr_required \
ruby3.2-rubygem-attr_required(aarch-64) \
rubygem(attr_required) \
rubygem(ruby:3.2.0:attr_required) \
rubygem(ruby:3.2.0:attr_required:1) \
rubygem(ruby:3.2.0:attr_required:1.0) \
rubygem(ruby:3.2.0:attr_required:1.0.1)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
