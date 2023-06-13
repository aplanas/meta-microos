SUMMARY = "Ruby library for Windows Remote Management"
DESCRIPTION = "Ruby library for Windows Remote Management."
LICENSE = "Apache-2.0"

PV = "2.3.6"

RPM_NAME = "ruby3.2-rubygem-winrm-2.3.6-1.12.aarch64.rpm"
RPM_HASH = "c04821ed105803d7fd556803854f3636454a164a388f6aeb23f02fed42cb343a8ba8fdddd25edfebcd2c2c58af8f45ff0fe3ce8e1242638873c54b3976934f69"

RPROVIDES:${PN} += "ruby3.2-rubygem-winrm \
ruby3.2-rubygem-winrm(aarch-64) \
rubygem(ruby:3.2.0:winrm) \
rubygem(ruby:3.2.0:winrm:2) \
rubygem(ruby:3.2.0:winrm:2.3) \
rubygem(ruby:3.2.0:winrm:2.3.6) \
rubygem(winrm)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:builder) \
rubygem(ruby:3.2.0:erubi:1) \
rubygem(ruby:3.2.0:gssapi:1) \
rubygem(ruby:3.2.0:gyoku:1) \
rubygem(ruby:3.2.0:httpclient) \
rubygem(ruby:3.2.0:httpclient:2) \
rubygem(ruby:3.2.0:logging) \
rubygem(ruby:3.2.0:nori:2) \
rubygem(ruby:3.2.0:rubyntlm) \
rubygem(ruby:3.2.0:rubyntlm:0.6) \
update-alternatives"

inherit rpm
