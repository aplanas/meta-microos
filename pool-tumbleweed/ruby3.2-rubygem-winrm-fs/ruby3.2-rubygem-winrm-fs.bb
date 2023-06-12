SUMMARY = "WinRM File System"
DESCRIPTION = "Ruby library for file system operations via Windows Remote Management."
LICENSE = "Apache-2.0"

PV = "1.3.5"

RPM_NAME = "ruby3.2-rubygem-winrm-fs-1.3.5-1.16.aarch64.rpm"
RPM_HASH = "5a935d109a1b8d5d69f05132de89d7c3c5538895340ba97ac383643591fb23f7ad699db3fae29d1ced2676671aef57ed21d93b7acbd5e0b02a74b5effedde070"

RPROVIDES:${PN} += "ruby3.2-rubygem-winrm-fs \
ruby3.2-rubygem-winrm-fs(aarch-64) \
rubygem(ruby:3.2.0:winrm-fs) \
rubygem(ruby:3.2.0:winrm-fs:1) \
rubygem(ruby:3.2.0:winrm-fs:1.3) \
rubygem(ruby:3.2.0:winrm-fs:1.3.5) \
rubygem(winrm-fs)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:erubi:1) \
rubygem(ruby:3.2.0:logging) \
rubygem(ruby:3.2.0:rubyzip:2) \
rubygem(ruby:3.2.0:winrm:2) \
update-alternatives"

inherit rpm
