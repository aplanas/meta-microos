SUMMARY = "The bzip2 program and Library Documentation"
DESCRIPTION = "The bzip2 program and library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "bzip2-doc-1.0.8-5.3.noarch.rpm"
RPM_HASH = "e75b862d9ed72b34a9fe2f6a96df624a9644649c65c62414aa809cfb557f2335fb057b85c8c65feb514461e83604c29631df8025749b9c0a9eaf870b81981960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bzip2-doc"
RDEPENDS:${PN} += ""

inherit rpm
