SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.6.3"

RPM_NAME = "python310-livereload-2.6.3-5.2.noarch.rpm"
RPM_HASH = "9c80e1374694180b7c6444797fe1adffce30df7e95308eec9fbd4260b01bd6e80cb80ad03424848572f5d8a91b72e3a0deab213d5b91367d4d4b340939415e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-livereload \
python3.10dist-livereload \
python310-livereload \
python3dist-livereload"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
python310-tornado \
update-alternatives"

inherit rpm
