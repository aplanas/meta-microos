SUMMARY = "Mustache is a framework-agnostic way to render logic-free views"
DESCRIPTION = "Inspired by ctemplate, Mustache is a framework-agnostic way to render \
logic-free views. \
As ctemplates says, 'It emphasizes separating logic from presentation: \
it is impossible to embed application logic in this template \
language. \
Think of Mustache as a replacement for your views. Instead of views \
consisting of ERB or HAML with random helpers and arbitrary logic, \
your views are broken into two parts: a Ruby class and an HTML \
template."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ruby3.2-rubygem-mustache-1.1.1-1.19.aarch64.rpm"
RPM_HASH = "dd5067abeb2e3ea92564cef8e32a42a14b400b7fc8a6731541fa7f087860ef9146a97f67729fbfcd43a1b512a233e170a64c35ae8acf2d778f625839a4958ee1"

RPROVIDES:${PN} += "ruby3.2-rubygem-mustache \
rubygem-mustache \
rubygem-ruby-3.2.0-mustache \
rubygem-ruby-3.2.0-mustache-1 \
rubygem-ruby-3.2.0-mustache-1.1 \
rubygem-ruby-3.2.0-mustache-1.1.1"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
update-alternatives"

inherit rpm
