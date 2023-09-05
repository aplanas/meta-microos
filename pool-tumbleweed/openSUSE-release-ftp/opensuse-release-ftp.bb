SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "openSUSE-release-ftp-20230902-1800.1.aarch64.rpm"
RPM_HASH = "89c0a25127450b1b78252d826c0510549a57cf8e5f5f66c2b14f6323f00874de80f32a13ab9bc35b8b00097d6fbb5b9926bcbd7424d7c4918fa1ab2b4ce5ca71"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
