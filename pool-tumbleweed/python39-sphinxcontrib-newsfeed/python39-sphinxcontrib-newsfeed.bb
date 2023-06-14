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

RPM_NAME = "python39-sphinxcontrib-newsfeed-0.1.4-4.15.noarch.rpm"
RPM_HASH = "8314d27c26dcab34c1f2bc58e70618c5610600f73dc288d5c8597da0be7ef6478d31d09d8c05d53b8c75b8cef36f2158f7832c17ce32e74a99c8ab74762c0112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-newsfeed \
python39-sphinxcontrib-newsfeed \
python3dist-sphinxcontrib-newsfeed"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
