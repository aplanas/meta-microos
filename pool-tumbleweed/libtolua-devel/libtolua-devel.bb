SUMMARY = "Development headers for tolua"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require these."
LICENSE = "GPL-2.0+"

PV = "5.2.4"

RPM_NAME = "libtolua-devel-5.2.4-4.3.aarch64.rpm"
RPM_HASH = "189dbdef7a076ab8ac2ea2f16261988622ec2383bb7982c2160d187c040b42e62907513486df56517ac5f0cd2dbc1b6b7f64182ca9a76ae1216c55e61facd712"

RPROVIDES:${PN} += "libtolua-devel \
tolua-devel"

RDEPENDS:${PN} += "tolua"

inherit rpm
