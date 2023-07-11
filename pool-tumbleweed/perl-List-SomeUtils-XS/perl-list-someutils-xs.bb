SUMMARY = "XS implementation for List::SomeUtils"
DESCRIPTION = "There are no user-facing parts here. See List::SomeUtils for API details. \
 \
You shouldn't have to install this module directly. When you install \
List::SomeUtils, it checks whether your system has a compiler. If it does, \
then it adds a dependency on this module so that it gets installed and you \
have the faster XS implementation. \
 \
This distribution requires List::SomeUtils but to avoid a circular \
dependency, that dependency is explicitly left out from the this \
distribution's metadata. However, without LSU already installed this module \
cannot function."
LICENSE = "Artistic-2.0"

PV = "0.58"

RPM_NAME = "perl-List-SomeUtils-XS-0.58-1.27.aarch64.rpm"
RPM_HASH = "48a5a2254efad2a91b19cd2a43bdad0c2938451b85cf004d3451844df202ba76527cf228f859c9c8dc389dc99e039194b63b14542007a61db38023e4ae36805c"

RPROVIDES:${PN} += "perl-List--SomeUtils--XS \
perl-List-SomeUtils-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
