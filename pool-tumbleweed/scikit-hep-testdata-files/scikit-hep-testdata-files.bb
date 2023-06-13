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

PV = "0.4.30"

RPM_NAME = "scikit-hep-testdata-files-0.4.30-1.1.noarch.rpm"
RPM_HASH = "b5a62fa624255293870cd1f650f9aeaae5098b0f6f77d1321e0e1f1b463b308eea309fd0d0c94802d845321241e9969a0941b974d0bdaebffc5869dd2e674ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scikit-hep-testdata-files"

RDEPENDS:${PN} += ""

inherit rpm
