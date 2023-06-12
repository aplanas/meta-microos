SUMMARY = "Terminal painter!"
DESCRIPTION = "Terminal painter with RGB and 256 (fallback) color and terminal effects \
support. No string extensions! Usage: Paint['string', :red, :bright]."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ruby3.2-rubygem-paint-2.3.0-1.5.aarch64.rpm"
RPM_HASH = "a48fa1a92aeeb3a65b530fa5439229dc5c1ceb8acd517d97b8eabc9cbc79fcb3754aa38c2b22149929b3735d733a1f1a2f8d4047923ce6da02b6a9685ac90f49"

RPROVIDES:${PN} += "ruby3.2-rubygem-paint \
ruby3.2-rubygem-paint(aarch-64) \
rubygem(paint) \
rubygem(ruby:3.2.0:paint) \
rubygem(ruby:3.2.0:paint:2) \
rubygem(ruby:3.2.0:paint:2.3) \
rubygem(ruby:3.2.0:paint:2.3.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
