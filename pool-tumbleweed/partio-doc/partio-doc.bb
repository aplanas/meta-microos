SUMMARY = "Documentation files for partio"
DESCRIPTION = "The partio-doc contains documentastion for the library."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "partio-doc-1.14.6-1.10.noarch.rpm"
RPM_HASH = "87efc42b72f8bef5b377c2134cb42639757c1b59925325d7254eb7e159bc32d4855a6ab0d27f3e0ba37e6984453df1b71f0c5428db92af92bc0f9bbe65a34603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "partio-doc"

RDEPENDS:${PN} += "partio"

inherit rpm
