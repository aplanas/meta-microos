SUMMARY = "lightbox2 for Ruby on Rails"
DESCRIPTION = "This gem for Ruby on Rails provides the lightbox2 library to Rails's asset \
pipeline."
LICENSE = "MIT"

PV = "2.11.3"

RPM_NAME = "ruby3.2-rubygem-lightbox2-2.11.3-1.12.aarch64.rpm"
RPM_HASH = "6858a4c591a6e4162711613b9a1862b4e0b76bfa2e0fda4e4e69cad0f5a46f74a04f9e448989f948d4de85c3cfaec37211e8f03358a4bf5a4a28654845b1585d"

RPROVIDES:${PN} += "ruby3.2-rubygem-lightbox2 \
ruby3.2-rubygem-lightbox2(aarch-64) \
rubygem(lightbox2) \
rubygem(ruby:3.2.0:lightbox2) \
rubygem(ruby:3.2.0:lightbox2:2) \
rubygem(ruby:3.2.0:lightbox2:2.11) \
rubygem(ruby:3.2.0:lightbox2:2.11.3)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:jquery-rails)"

inherit rpm
