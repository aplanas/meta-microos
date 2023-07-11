SUMMARY = "Rich text framework"
DESCRIPTION = "Edit and display rich text in Rails applications."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-actiontext-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "6f8501987378fad19de88ea3eadefbc76415187fab14d145e89620b85e8a09d1ca16f0f9af4090e6aaf5f46949dbee797281662dd57375be8959c0c95b62160c"

RPROVIDES:${PN} += "ruby3.2-rubygem-actiontext-7.0 \
rubygem-actiontext \
rubygem-ruby-3.2.0-actiontext \
rubygem-ruby-3.2.0-actiontext-7 \
rubygem-ruby-3.2.0-actiontext-7.0 \
rubygem-ruby-3.2.0-actiontext-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-actionpack \
rubygem-ruby-3.2.0-activerecord \
rubygem-ruby-3.2.0-activestorage \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-globalid \
rubygem-ruby-3.2.0-nokogiri"

inherit rpm
