SUMMARY = "A fake FTP server for use with RSpec"
DESCRIPTION = "This is a gem that allows you to test FTP implementations in ruby. It is a minimal single-client FTP server that can be bound to any arbitrary port on localhost."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "ruby3.2-rubygem-fake_ftp-0.3.0-1.18.aarch64.rpm"
RPM_HASH = "e7c7aad30b6edaa7d36d5b772df502fa26428c4732e6f2690052dd75e8fda3aa420f5aa35db3a60c98082a8febacc1e0ebcb6f5ea11f8f1bd52033f618cffeee"

RPROVIDES:${PN} += "ruby3.2-rubygem-fake_ftp \
ruby3.2-rubygem-fake_ftp(aarch-64) \
rubygem(fake_ftp) \
rubygem(ruby:3.2.0:fake_ftp) \
rubygem(ruby:3.2.0:fake_ftp:0) \
rubygem(ruby:3.2.0:fake_ftp:0.3) \
rubygem(ruby:3.2.0:fake_ftp:0.3.0)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
