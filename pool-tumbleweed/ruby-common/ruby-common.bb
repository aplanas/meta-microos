SUMMARY = "Collection of scripts and macros for ruby packaging"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "ruby-common-3.2.1-2.1.noarch.rpm"
RPM_HASH = "6fedbc9b305110eb595a8a57ae2976cdbaeffa66e412263b7f8f5e49b0417ed346a0ff9824bef7ad9c71c09be3ec1cbede7c2cf8ab7fc736d053d298131e4f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ruby-common \
rpm-macro-gem-base \
rpm-macro-gem-build \
rpm-macro-gem-cleanup \
rpm-macro-gem-doc-ext \
rpm-macro-gem-extensions \
rpm-macro-gem-install \
rpm-macro-gem-packages \
rpm-macro-gem-platform \
rpm-macro-gem-unpack \
rpm-macro-rb-arch \
rpm-macro-rb-archdir \
rpm-macro-rb-binary \
rpm-macro-rb-dir \
rpm-macro-rb-libdir \
rpm-macro-rb-sitearch \
rpm-macro-rb-sitearchdir \
rpm-macro-rb-sitedir \
rpm-macro-rb-sitelib \
rpm-macro-rb-sitelibdir \
rpm-macro-rb-vendorarch \
rpm-macro-rb-vendorarchdir \
rpm-macro-rb-vendordir \
rpm-macro-rb-vendorlib \
rpm-macro-rb-vendorlibdir \
rpm-macro-rb-ver \
rpm-macro-ruby \
rpm-macro-rubySTOP \
rpm-macro-rubydevel \
rpm-macro-rubydevelSTOP \
rpm-macro-rubydevelxSTOP \
rpm-macro-rubygem \
rpm-macro-rubygems-requires \
rpm-macro-rubygemsSTOP \
rpm-macro-rubygemsxSTOP \
rpm-macro-rubygemsxxSTOP \
rpm-macro-rubyxSTOP \
rpm-macro-set-gem-binary \
ruby-common \
ruby-macros"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/getopt \
/usr/bin/sh \
fdupes \
rubygem-gem2rpm \
util-linux"

inherit rpm
