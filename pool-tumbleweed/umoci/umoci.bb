SUMMARY = "Open Container Image manipulation tool"
DESCRIPTION = "umoci modifies Open Container images. umoci is a manipulation tool for OCI \
images. In particular, it is a more complete alternative to oci-image-tools \
provided by the OCI."
LICENSE = "Apache-2.0"

PV = "0.4.7"

RPM_NAME = "umoci-0.4.7-3.3.aarch64.rpm"
RPM_HASH = "a7334a14975537825d785351fd41b1863641900ef717b53a561776deea8b71522121562fb9f9a9e8a158d6667f66ba6931aaeab4e47220c2350b277755083249"

RPROVIDES:${PN} += "umoci"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
