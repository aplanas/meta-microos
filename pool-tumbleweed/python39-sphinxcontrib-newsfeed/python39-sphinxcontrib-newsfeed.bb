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

RPM_NAME = "python39-sphinxcontrib-newsfeed-0.1.4-4.17.noarch.rpm"
RPM_HASH = "3895f43b6b78a7730f9df6df5f1f8ba48e10950fb2f97d7b290c7b978c13f3595a45fb1518df8a7885b39a04404db5fb2331d8e26efb822efc04c799a7a37d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-newsfeed \
python39-sphinxcontrib-newsfeed \
python3dist-sphinxcontrib-newsfeed"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
