SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-compression-2.1.0-1.2.noarch.rpm"
RPM_HASH = "f9383dd8392ca91604337d5bf097fa247ff2f880cd59b54746dd8f72368149a226301d5105c2d641d379cdb7aa0f920dd77cd031d44c8a664bcaacfce3871e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-compression"

RDEPENDS:${PN} += "python310-pandas \
python310-zstandard"

inherit rpm
