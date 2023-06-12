SUMMARY = "A multipart form post accessory for Net::HTTP"
DESCRIPTION = "A multipart form post accessory for Net::HTTP."
LICENSE = "MIT"

PV = "2.2.3"

RPM_NAME = "ruby3.2-rubygem-multipart-post-2.2.3-1.6.aarch64.rpm"
RPM_HASH = "e951f0deede2efd971d180fc759d1cca22634d5a7f8329de601e5669b1248872a660e99f7408ed29553e8e01009050715d7190f0c906741f4cf7b08f423dfe73"

RPROVIDES:${PN} += "ruby3.2-rubygem-multipart-post \
ruby3.2-rubygem-multipart-post(aarch-64) \
rubygem(multipart-post) \
rubygem(ruby:3.2.0:multipart-post) \
rubygem(ruby:3.2.0:multipart-post:2) \
rubygem(ruby:3.2.0:multipart-post:2.2) \
rubygem(ruby:3.2.0:multipart-post:2.2.3)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
