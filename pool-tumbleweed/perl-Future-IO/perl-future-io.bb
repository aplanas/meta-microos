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

RPM_NAME = "perl-Future-IO-0.14-1.3.noarch.rpm"
RPM_HASH = "3db0de924b8e8ac7e2d8d8de9e7a9f7d3aef754d2585ad3942280222a7b54d47fb5b29f3947ff28792bfd449812b42797bcbc78e1c816900710622db80c034db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Future--IO \
perl-Future--IO--ImplBase \
perl-Future--IO--System \
perl-Future-IO"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Future \
perl-Struct--Dumb"

inherit rpm
