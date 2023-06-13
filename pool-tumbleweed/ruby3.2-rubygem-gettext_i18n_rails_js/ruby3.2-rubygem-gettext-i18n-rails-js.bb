SUMMARY = "Extends gettext_i18n_rails making your .po files available to client"
DESCRIPTION = "It will find translations inside your .js and .coffee files, then it will \
create JSON versions of your .PO files and will let you serve them with the \
rest of your assets, thus letting you access all your translations offline \
from client side javascript."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "ruby3.2-rubygem-gettext_i18n_rails_js-1.3.1-1.9.aarch64.rpm"
RPM_HASH = "e06214fa40d947bf754e6988bf7798e0d1a650698694b8ad0f1b3bff5672d246bc1e54f9a0a465c1bc396d264b4fba9be783cdd75fe86114fcb2b26ca5463710"

RPROVIDES:${PN} += "ruby3.2-rubygem-gettext_i18n_rails_js \
ruby3.2-rubygem-gettext_i18n_rails_js(aarch-64) \
rubygem(gettext_i18n_rails_js) \
rubygem(ruby:3.2.0:gettext_i18n_rails_js) \
rubygem(ruby:3.2.0:gettext_i18n_rails_js:1) \
rubygem(ruby:3.2.0:gettext_i18n_rails_js:1.3) \
rubygem(ruby:3.2.0:gettext_i18n_rails_js:1.3.1)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:gettext) \
rubygem(ruby:3.2.0:gettext_i18n_rails) \
rubygem(ruby:3.2.0:po_to_json) \
rubygem(ruby:3.2.0:rails)"

inherit rpm
