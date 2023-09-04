SUMMARY = "Assert reference counts on objects"
DESCRIPTION = "The Perl garbage collector uses simple reference counting during the normal \
execution of a program. This means that cycles or unweakened references in \
other parts of code can keep an object around for longer than intended. To \
help avoid this problem, the reference count of a new object from its class \
constructor ought to be 1. This way, the caller can know the object will be \
properly DESTROYed when it drops all of its references to it. \
 \
This module provides two test functions to help ensure this property holds \
for an object class, so as to be polite to its callers. \
 \
If the assertion fails; that is, if the actual reference count is different \
to what was expected, either of the following two modules may be used to \
assist the developer in finding where the references are."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-Test-Refcount-0.10-1.17.noarch.rpm"
RPM_HASH = "688aa8cf7e3f156fdb2319c7ffa3d821b82db9200f36e478f3dcd35de2a2ce291b153e5e689fa581a48cbe08084ef30ef98fedc8bbb5088c59da30765157b132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Refcount \
perl-Test-Refcount"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
