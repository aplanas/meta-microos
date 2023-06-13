SUMMARY = "A fake FTP server for use with RSpec"
DESCRIPTION = "This is a gem that allows you to test FTP implementations in ruby. It is a minimal single-client FTP server that can be bound to any arbitrary port on localhost."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ruby3.2-rubygem-fake_ftp-0_1-0.1.1-1.24.aarch64.rpm"
RPM_HASH = "c3f04ccc307afbd92a67e40d85b2ab994553d0b6beb3613ac327856ba563dcab9af4a2e8b17cf72e7dd8d15b973ebc90a54795ab0b9b5738835ab8046af17564"

RPROVIDES:${PN} += "ruby3.2-rubygem-fake_ftp-0_1 \
ruby3.2-rubygem-fake_ftp-0_1(aarch-64) \
rubygem(fake_ftp) \
rubygem(ruby:3.2.0:fake_ftp) \
rubygem(ruby:3.2.0:fake_ftp:0) \
rubygem(ruby:3.2.0:fake_ftp:0.1) \
rubygem(ruby:3.2.0:fake_ftp:0.1.1)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
