SUMMARY = "Javadoc for cal10n"
DESCRIPTION = "API documentation for cal10n."
LICENSE = "MIT"

PV = "0.8.1.10"

RPM_NAME = "cal10n-javadoc-0.8.1.10-1.5.noarch.rpm"
RPM_HASH = "dca9a5eab0b0696ec05a2d74dd28a3b879b61e7e3672dde9df8b0eb92defa81e8d9d5ddccc66d832992962faef247be3fbe9e59d5854a42a453f2aca015e601b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cal10n-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
