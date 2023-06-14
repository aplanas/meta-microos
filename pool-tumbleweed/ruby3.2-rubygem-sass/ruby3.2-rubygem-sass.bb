SUMMARY = "A powerful but elegant CSS compiler that makes CSS fun again"
DESCRIPTION = "Ruby Sass is deprecated! See https://sass-lang.com/ruby-sass for \
details. \
Sass makes CSS fun again. Sass is an extension of CSS, adding \
nested rules, variables, mixins, selector inheritance, and more. \
It's translated to well-formatted, standard CSS using the \
command line tool or a web-framework plugin."
LICENSE = "MIT"

PV = "3.7.4"

RPM_NAME = "ruby3.2-rubygem-sass-3.7.4-1.19.aarch64.rpm"
RPM_HASH = "a161a76cc80ecabd4107147c41ce0e1148185d2322738165d705107396f1196c07d33405c45ddfb3884c5a724c69bb12f6a50e8e7b64c2cbae64d1e661fdc8f3"

RPROVIDES:${PN} += "ruby3.2-rubygem-sass \
rubygem-ruby-3.2.0-sass \
rubygem-ruby-3.2.0-sass-3 \
rubygem-ruby-3.2.0-sass-3.7 \
rubygem-ruby-3.2.0-sass-3.7.4 \
rubygem-sass"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-sass-listen-4.0 \
update-alternatives"

inherit rpm
