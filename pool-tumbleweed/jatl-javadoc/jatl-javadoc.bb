SUMMARY = "Javadoc for jatl"
DESCRIPTION = "This package contains javadoc for jatl."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "jatl-javadoc-0.2.2-4.1.noarch.rpm"
RPM_HASH = "5b317a1717a04c2231dc5ef9d8666e1a61e1cd2287b7f7205078853f90fee792614679770d01d114af78d33f34bfaaa77743c3d476052a53b72a3da01263c8fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jatl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
