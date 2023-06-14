SUMMARY = "Manipulate images with minimal use of memory via ImageMagick /"
DESCRIPTION = "Manipulate images with minimal use of memory via ImageMagick / GraphicsMagick."
LICENSE = "MIT"

PV = "4.12.0"

RPM_NAME = "ruby3.2-rubygem-mini_magick-4.12.0-1.3.aarch64.rpm"
RPM_HASH = "14e986dedc8a958499a3e119b283ca02cb4b006a674be4dafe44439dea13dc043cf0cb34feb96c6594278affe316206dc7ad1e2a26b211bfa7b4f1a143bc0f59"

RPROVIDES:${PN} += "ruby3.2-rubygem-mini-magick \
rubygem-mini-magick \
rubygem-ruby-3.2.0-mini-magick \
rubygem-ruby-3.2.0-mini-magick-4 \
rubygem-ruby-3.2.0-mini-magick-4.12 \
rubygem-ruby-3.2.0-mini-magick-4.12.0"

RDEPENDS:${PN} += "ImageMagick \
ruby-abi"

inherit rpm
