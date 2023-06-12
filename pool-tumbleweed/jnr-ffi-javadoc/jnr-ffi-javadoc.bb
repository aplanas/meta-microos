SUMMARY = "Javadocs for jnr-ffi"
DESCRIPTION = "This package contains the API documentation for jnr-ffi."
LICENSE = "Apache-2.0"

PV = "2.2.13"

RPM_NAME = "jnr-ffi-javadoc-2.2.13-1.1.noarch.rpm"
RPM_HASH = "61dad031bcadbce8840efb27fc37f4f7fb4de86099bf33aadd4b8781b8239d0d5dc7be4a5d1bd35c795d72c5844091bb1356b7857426c46b5d146acdb9f9c529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-ffi-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
