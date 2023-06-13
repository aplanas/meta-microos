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

RPM_NAME = "perl-List-SomeUtils-XS-0.58-1.26.aarch64.rpm"
RPM_HASH = "8e8fa773d139a2a1746099ec50897b25c6e05eb74e580063e235f8160ad9233926288665941f506dad3b0662d6d6b1197b16f46237627844a9aa3439cad417ac"

RPROVIDES:${PN} += "perl(List::SomeUtils::XS) \
perl-List-SomeUtils-XS \
perl-List-SomeUtils-XS(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
