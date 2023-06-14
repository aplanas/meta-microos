SUMMARY = "News Feed extension for Sphinx"
DESCRIPTION = "sphinxcontrib-newsfeed is a extension for adding a simple Blog, News or Announcements section to a Sphinx website. \
 \
Features: \
 * Makes feed entries from Sphinx documents. \
 * Generates a list of entries with teasers. \
 * Saves the feed to a file in RSS format. \
 * Supports comments via Disqus."
LICENSE = "BSD-2-Clause"

PV = "0.1.4"

RPM_NAME = "python310-sphinxcontrib-newsfeed-0.1.4-4.15.noarch.rpm"
RPM_HASH = "0a9359be968cccbeb5b4560949bcfd9253c7579f3e12618a3f846c4a7e1fdcfaea7460e2ef582c9b00636b5f469bed8362eb7e7ad2c892e4d87300dbe23025ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-newsfeed \
python3.10dist-sphinxcontrib-newsfeed \
python310-sphinxcontrib-newsfeed \
python3dist-sphinxcontrib-newsfeed"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
