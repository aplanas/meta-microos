SUMMARY = "Javadoc for jwnl"
DESCRIPTION = "This package contains javadoc for jwnl."
LICENSE = "BSD-3-Clause"

PV = "1.4~rc3"

RPM_NAME = "jwnl-javadoc-1.4~rc3-2.11.noarch.rpm"
RPM_HASH = "d652bdeb425c4fff4578b91c45d2dcf5b41de034f65fb1d523782a61c88fa6224e50bdecea685a3fe14d6cbe04bae3bf2f91d0e476dcfbc0cdaa082c42de836a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwnl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
