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

RPM_NAME = "perl-List-SomeUtils-XS-0.58-1.28.aarch64.rpm"
RPM_HASH = "771a70fbacff86f84ec3cc8d92692ff580f0dff4addfc7845fd4f464fcd466dc32f9165941cbc36168cbcbdbb6a3423b3323fead307639c1db6f8d85ae89ce2a"

RPROVIDES:${PN} += "perl-List--SomeUtils--XS \
perl-List-SomeUtils-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
