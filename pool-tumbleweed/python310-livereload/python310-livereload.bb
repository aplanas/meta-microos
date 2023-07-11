SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.6.3"

RPM_NAME = "python310-livereload-2.6.3-5.4.noarch.rpm"
RPM_HASH = "4fa5efe12fbd1c4312737629199b12694a595463be884d4ccdb8a9709460d4e791a13aa97249e059d3b2891ddaf1ab2a47aa05502f6b7d0f87866a2349a45916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-livereload \
python310-livereload \
python3dist-livereload"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
python310-tornado \
update-alternatives"

inherit rpm
