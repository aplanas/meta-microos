SUMMARY = "Sphinx 'youtube' extension"
DESCRIPTION = "Sphinx 'youtube' extension"
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python311-sphinxcontrib-youtube-1.2.0-1.1.noarch.rpm"
RPM_HASH = "2768bd25a45a756202c6ac8d42d518f562cdf322fe880765f90e1e3f2c61f26241d52f2c1eff1923e9b20bb34cc6736431d8275e942a0e607744b0f4562f92a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-youtube \
python3.11dist-sphinxcontrib-youtube \
python311-sphinxcontrib-youtube \
python3dist-sphinxcontrib-youtube"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-requests"

inherit rpm
