SUMMARY = "Future-returning IO methods"
DESCRIPTION = "This package provides a few basic methods that behave similarly to the \
same-named core perl functions relating to IO operations, but yield their \
results asynchronously via Future instances. \
 \
This is provided primarily as a decoupling mechanism, to allow modules to \
be written that perform IO in an asynchronous manner to depend directly on \
this, while allowing asynchronous event systems to provide an \
implementation of these operations."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-Future-IO-0.14-1.1.noarch.rpm"
RPM_HASH = "fdd471778b96ee66844da741a364ebff382e6fdb3102981a8c61fb9e15f065f63008aaee41511cd9e24398473fe8c5004141c9b2cd9e4ed42a7e7ef6dc28704e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Future::IO) \
perl(Future::IO::ImplBase) \
perl(Future::IO::System) \
perl-Future-IO"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Future) \
perl(Struct::Dumb)"

inherit rpm
