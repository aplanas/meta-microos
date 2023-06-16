SUMMARY = "Generate rpm specfiles from gems"
DESCRIPTION = "Generate source rpms and rpm spec files from a Ruby Gem. \
The spec file tries to follow the gem as closely as possible"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "ruby3.2-rubygem-gem2rpm-0.10.1-21.1.aarch64.rpm"
RPM_HASH = "143f5dcfbb07dd2df3389da768513226c92a4fe01db285c31463b61fa1f1846490ebf43eb8317a54ad6dfddc00804c1551b6ae0cbf7f74645fd6174a1f09f053"

RPROVIDES:${PN} += "ruby3.2-rubygem-gem2rpm \
rubygem-gem2rpm \
rubygem-ruby-3.2.0-gem2rpm \
rubygem-ruby-3.2.0-gem2rpm-0 \
rubygem-ruby-3.2.0-gem2rpm-0.10 \
rubygem-ruby-3.2.0-gem2rpm-0.10.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
update-alternatives"

inherit rpm
