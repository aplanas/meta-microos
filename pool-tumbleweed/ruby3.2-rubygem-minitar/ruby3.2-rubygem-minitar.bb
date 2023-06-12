SUMMARY = "The minitar library is a pure-Ruby library that provides the ability"
DESCRIPTION = "The minitar library is a pure-Ruby library that provides the ability to deal \
with POSIX tar(1) archive files. \
This is release 0.9, adding a minor feature to Minitar.unpack and \
Minitar::Input#extract_entry that when <tt>:fsync => false</tt> is provided, \
fsync will be skipped. \
minitar (previously called Archive::Tar::Minitar) is based heavily on code \
originally written by Mauricio Julio Fernández Pradier for the rpa-base \
project."
LICENSE = "Ruby"

PV = "0.9"

RPM_NAME = "ruby3.2-rubygem-minitar-0.9-1.13.aarch64.rpm"
RPM_HASH = "ca1e7bcea481f8cfb3ff3013fd1f08c1f54c87d74b51f02c84108f4b60e652596d384c910de68586d0e2b4abcfb709d0dfa6319022b407f4bc7601cb15bcdbc8"

RPROVIDES:${PN} += "ruby3.2-rubygem-minitar \
ruby3.2-rubygem-minitar(aarch-64) \
rubygem(minitar) \
rubygem(ruby:3.2.0:minitar) \
rubygem(ruby:3.2.0:minitar:0) \
rubygem(ruby:3.2.0:minitar:0.9)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
