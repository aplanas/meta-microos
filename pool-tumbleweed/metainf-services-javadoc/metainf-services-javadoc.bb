SUMMARY = "Javadoc for metainf-services"
DESCRIPTION = "This package contains the API documentation for metainf-services."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "metainf-services-javadoc-1.9-1.10.noarch.rpm"
RPM_HASH = "2c80a92a2d057f8d21f7bc303914f32477143aa4b94bc718bc8cc54f0e960d0dc72e5409a8d1de08f89f20cc4b7b0c18adc3ac5ab05a7b8264cfd9bf3017eae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metainf-services-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
