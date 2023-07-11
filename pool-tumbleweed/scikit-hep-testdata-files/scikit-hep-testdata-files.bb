SUMMARY = "Example HEP files for testing and demonstrating - common file package"
DESCRIPTION = "A common package to provide example files (*e.g*. ROOT) for testing and \
developing packages against.  The sample of files is representative of typical \
files found 'in the wild'. \
 \
In addition to including some root files directly, this package adds some \
simple helper methods to get larger files from common open-access data \
repositories. \
 \
This subpackage contains the data files for all python flavors."
LICENSE = "BSD-3-Clause"

PV = "0.4.31"

RPM_NAME = "scikit-hep-testdata-files-0.4.31-1.1.noarch.rpm"
RPM_HASH = "67bf7440262450061ce1c30002322e69e857c6e56146b44f7a1908c69fc3a84b59bb93ec3777a22c3b5ce39a09f097fe800aa1a7ce27c823c16d3bc23108b276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scikit-hep-testdata-files"

RDEPENDS:${PN} += ""

inherit rpm
