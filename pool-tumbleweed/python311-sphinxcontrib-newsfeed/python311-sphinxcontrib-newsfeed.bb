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

RPM_NAME = "python311-sphinxcontrib-newsfeed-0.1.4-4.17.noarch.rpm"
RPM_HASH = "549e35b8f8019cdbf35b7924bdf9743d7a1d0777ddb5e9ed1c97f72f06d2eb056f4fe660fb1313dd056ff4c2d499e023c2f7c964da74b399f4c0fbc26428714f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-newsfeed \
python3.11dist-sphinxcontrib-newsfeed \
python311-sphinxcontrib-newsfeed \
python3dist-sphinxcontrib-newsfeed"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
