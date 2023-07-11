SUMMARY = "Javadoc for auto"
DESCRIPTION = "This package contains javadoc for auto."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-javadoc-1.6.1-1.11.noarch.rpm"
RPM_HASH = "b9dc9d8083d6d898854b2fa8a7d7773b05f3f9aac3d4429dc0936b05bbc43471bb9ddb4cd591591926c0725a03a8269e8dec7ae0c5af92395bcb988fd5362ea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
