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

RPM_NAME = "python310-sphinxcontrib-newsfeed-0.1.4-4.17.noarch.rpm"
RPM_HASH = "776f88ade68d3132cc132bae690146306c173470daca6ec0de01e9286c6c1ee29bb56ec7c7172a5a0a5501782bb709f54496fc3a2153d3f4e3358ad398a25f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-newsfeed \
python310-sphinxcontrib-newsfeed \
python3dist-sphinxcontrib-newsfeed"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
