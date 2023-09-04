SUMMARY = "Ruby packaging helpers"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses. \
 \
Some helper tools for packaging rubygems and rails apps."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "ruby-packaging-helpers-3.2.1-2.1.noarch.rpm"
RPM_HASH = "87c2deb564146bfd893723fbd95d0238cbfd36dbe1b58667d9b43d6a8e10d4e49e9c0ca94dc0b999a0d10b2f8ffbec6cc53973159fbd0611536c8990485ef287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-packaging-helpers"

RDEPENDS:${PN} += "/usr/bin/ruby \
ruby-common"

inherit rpm
