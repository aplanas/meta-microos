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

RPM_NAME = "perl-Future-IO-0.14-1.2.noarch.rpm"
RPM_HASH = "91efeef4f20b1937cb2e44707cb9cd452ecc7ef0a037fbb2e9696c88619628bebc752d0b3c7349b45d59225efabba7c0af8a7dc3f426e4053fc80061bc6a1eae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Future--IO \
perl-Future--IO--ImplBase \
perl-Future--IO--System \
perl-Future-IO"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Future \
perl-Struct--Dumb"

inherit rpm
