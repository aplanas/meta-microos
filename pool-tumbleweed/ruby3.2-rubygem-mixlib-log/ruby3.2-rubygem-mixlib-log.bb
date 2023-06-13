SUMMARY = "A gem that provides a simple mixin for log functionality"
DESCRIPTION = "A gem that provides a simple mixin for log functionality."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "ruby3.2-rubygem-mixlib-log-3.0.9-1.14.aarch64.rpm"
RPM_HASH = "ef2230acd68ff9ecef1388ddcf2bcebdc2a49ada78d86cb9db6362216cae51b890953a53ade65914be8fb6b415171dc3cb8bb47babfff23675dbd4a5a07de7e2"

RPROVIDES:${PN} += "ruby3.2-rubygem-mixlib-log \
ruby3.2-rubygem-mixlib-log(aarch-64) \
rubygem(mixlib-log) \
rubygem(ruby:3.2.0:mixlib-log) \
rubygem(ruby:3.2.0:mixlib-log:3) \
rubygem(ruby:3.2.0:mixlib-log:3.0) \
rubygem(ruby:3.2.0:mixlib-log:3.0.9)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
