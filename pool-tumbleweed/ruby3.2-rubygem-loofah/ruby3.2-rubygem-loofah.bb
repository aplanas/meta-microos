SUMMARY = "HTML/XML manipulation and sanitization based on Nokogiri"
DESCRIPTION = "Loofah is a general library for manipulating and transforming HTML/XML documents and fragments. \
It's built on top of Nokogiri and libxml2, so it's fast and has a nice API. \
 \
Loofah excels at HTML sanitization (XSS prevention). It includes some nice HTML sanitizers, \
which are based on HTML5lib's whitelist, so it most likely won't make your codes less secure."
LICENSE = "MIT"

PV = "2.19.1"

RPM_NAME = "ruby3.2-rubygem-loofah-2.19.1-1.2.aarch64.rpm"
RPM_HASH = "91ff06f272fc8c74dfe9ba3c95f4c28a0f9c606701c5a677660786c5131cb7d441c9d9f6d7232adaa3b7f1b3225e713b1bb44569a9f44c5b16333b2a7482f0ce"

RPROVIDES:${PN} += "ruby3.2-rubygem-loofah \
rubygem-loofah \
rubygem-ruby-3.2.0-loofah \
rubygem-ruby-3.2.0-loofah-2 \
rubygem-ruby-3.2.0-loofah-2.19 \
rubygem-ruby-3.2.0-loofah-2.19.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-crass-1.0 \
rubygem-ruby-3.2.0-nokogiri"

inherit rpm
