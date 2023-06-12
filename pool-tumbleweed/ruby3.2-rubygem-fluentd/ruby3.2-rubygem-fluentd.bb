SUMMARY = "Fluentd event collector"
DESCRIPTION = "Fluentd is an open source data collector designed to scale and simplify log \
management. It can collect, process and ship many kinds of data in near \
real-time."
LICENSE = "Apache-2.0"

PV = "1.15.3"

RPM_NAME = "ruby3.2-rubygem-fluentd-1.15.3-1.4.aarch64.rpm"
RPM_HASH = "663be7f2456547bf23980af32ef2b3798f01467a52a7fa1b347ebc75a7b655681256dd5c1aa3352cc0c05adec589cf3b4e7fe175741d6acebf2f2aaae7fe6cb6"

RPROVIDES:${PN} += "ruby3.2-rubygem-fluentd \
ruby3.2-rubygem-fluentd(aarch-64) \
rubygem(fluentd) \
rubygem(ruby:3.2.0:fluentd) \
rubygem(ruby:3.2.0:fluentd:1) \
rubygem(ruby:3.2.0:fluentd:1.15) \
rubygem(ruby:3.2.0:fluentd:1.15.3)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:bundler) \
rubygem(ruby:3.2.0:cool.io) \
rubygem(ruby:3.2.0:http_parser.rb) \
rubygem(ruby:3.2.0:msgpack) \
rubygem(ruby:3.2.0:serverengine) \
rubygem(ruby:3.2.0:sigdump:0.2) \
rubygem(ruby:3.2.0:strptime) \
rubygem(ruby:3.2.0:tzinfo) \
rubygem(ruby:3.2.0:tzinfo-data:1) \
rubygem(ruby:3.2.0:webrick) \
rubygem(ruby:3.2.0:yajl-ruby:1) \
update-alternatives"

inherit rpm
