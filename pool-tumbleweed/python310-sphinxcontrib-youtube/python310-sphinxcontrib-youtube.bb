SUMMARY = "Sphinx 'youtube' extension"
DESCRIPTION = "Sphinx 'youtube' extension"
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python310-sphinxcontrib-youtube-1.2.0-1.1.noarch.rpm"
RPM_HASH = "ee6209c01dcf949b14bd91c16cc0df103043f35e36a2c74d5ab40a8928aa746e6ef5e981c973b672c3c06099243f896e99b84463ba3319312d4e1a582011cf93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-youtube \
python310-sphinxcontrib-youtube \
python3dist-sphinxcontrib-youtube"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-requests"

inherit rpm
