SUMMARY = "a library for building easy-to-use command-line tools"
DESCRIPTION = "Cri allows building easy-to-use command-line interfaces with support for \
subcommands."
LICENSE = "MIT"

PV = "2.15.11"

RPM_NAME = "ruby3.2-rubygem-cri-2.15.11-3.9.aarch64.rpm"
RPM_HASH = "f8c8113e243bdeee9a51f5f1740e44629fab388b9c55603895f753d3bdcb434f0cd4013df6f906db18d201510227c5d07d6e566700d16ba656402c30b4e82040"

RPROVIDES:${PN} += "ruby3.2-rubygem-cri \
ruby3.2-rubygem-cri(aarch-64) \
rubygem(cri) \
rubygem(ruby:3.2.0:cri) \
rubygem(ruby:3.2.0:cri:2) \
rubygem(ruby:3.2.0:cri:2.15) \
rubygem(ruby:3.2.0:cri:2.15.11)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
