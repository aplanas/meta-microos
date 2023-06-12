SUMMARY = "Add the colors of the rainbow to your terminal a.k.a. Rainbows and Unicorns!"
DESCRIPTION = "This is a console program that transforms text from files or stdin by adding \
crazy rainbow colors or even animations."
LICENSE = "BSD-3-Clause"

PV = "100.0.1"

RPM_NAME = "ruby3.2-rubygem-lolcat-100.0.1-1.19.aarch64.rpm"
RPM_HASH = "615c728ad9be725fd6649c64af3e230844a79f33ae37723975791dbb8dc42ce3b9ade62c730746a54ec296ce0ea00c3678f68ccf0e8a7322834c51ad0138b4fa"

RPROVIDES:${PN} += "ruby3.2-rubygem-lolcat \
ruby3.2-rubygem-lolcat(aarch-64) \
rubygem(lolcat) \
rubygem(ruby:3.2.0:lolcat) \
rubygem(ruby:3.2.0:lolcat:100) \
rubygem(ruby:3.2.0:lolcat:100.0) \
rubygem(ruby:3.2.0:lolcat:100.0.1)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:manpages:0.6) \
rubygem(ruby:3.2.0:optimist:3.0) \
rubygem(ruby:3.2.0:paint:2) \
update-alternatives"

inherit rpm
