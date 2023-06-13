SUMMARY = "Rebuild your Jekyll site when a file changes with the `--watch`"
DESCRIPTION = "Rebuild your Jekyll site when a file changes with the `--watch` switch."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "ruby3.2-rubygem-jekyll-watch-2.2.1-1.17.aarch64.rpm"
RPM_HASH = "f46da532d63cdc16c19e39abdd475e5f077fb9f9cf733bab4505bbe2bb9341f883be381ff6c0097a2819296e504383960380d26752c9ac4cf4af2ab679d8665d"

RPROVIDES:${PN} += "ruby3.2-rubygem-jekyll-watch \
ruby3.2-rubygem-jekyll-watch(aarch-64) \
rubygem(jekyll-watch) \
rubygem(ruby:3.2.0:jekyll-watch) \
rubygem(ruby:3.2.0:jekyll-watch:2) \
rubygem(ruby:3.2.0:jekyll-watch:2.2) \
rubygem(ruby:3.2.0:jekyll-watch:2.2.1)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:listen:3)"

inherit rpm
