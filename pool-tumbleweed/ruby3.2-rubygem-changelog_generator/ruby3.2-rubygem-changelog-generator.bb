SUMMARY = "Create changelog for SLE images for Docker"
DESCRIPTION = "A tool to generate Docker images changelog starting from the .packages \
files created by kiwi."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "ruby3.2-rubygem-changelog_generator-0.3.0-1.22.aarch64.rpm"
RPM_HASH = "7ebe51a2ea41bdce7a76b59b43f85a738bac80a7cafe285977a49d4fde28837ed735beff71d71c82d5ea6585257d717a9922888d8a6b1a5ff242534bda13f2ca"

RPROVIDES:${PN} += "ruby3.2-rubygem-changelog_generator \
ruby3.2-rubygem-changelog_generator(aarch-64) \
rubygem(changelog_generator) \
rubygem(ruby:3.2.0:changelog_generator) \
rubygem(ruby:3.2.0:changelog_generator:0) \
rubygem(ruby:3.2.0:changelog_generator:0.3) \
rubygem(ruby:3.2.0:changelog_generator:0.3.0)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:rpm) \
update-alternatives"

inherit rpm
