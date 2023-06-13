SUMMARY = "Brushes to be used with the MyPaint library"
DESCRIPTION = "This package contains brush files for use with MyPaint and other programs."
LICENSE = "CC0-1.0"

PV = "2.0.2"

RPM_NAME = "mypaint-brushes-2.0.2-1.9.noarch.rpm"
RPM_HASH = "a13b6ebc2e52d4361c7c65ab30b5ab5d474c507ba4d67749a8f98836b09a98572afa89aaf971ac20aba6664ee515009ead7bf5d15ad0949445c93eb02f679888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypaint-brushes"

RDEPENDS:${PN} += ""

inherit rpm
