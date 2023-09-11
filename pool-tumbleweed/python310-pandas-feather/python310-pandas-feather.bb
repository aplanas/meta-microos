SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-feather-2.0.3-1.3.noarch.rpm"
RPM_HASH = "714d86c022ceaf96657a0a291aac18613b3053f82e9e23ee47ed895a9ab432468d70ef8a9db9adc8172d95242ba433287aaef080e0656aa33f899d9eb61d5968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-feather"

RDEPENDS:${PN} += "python310-pandas \
python310-pyarrow"

inherit rpm
