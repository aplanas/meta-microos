SUMMARY = "A Sphinx extension for changelog manipulation"
DESCRIPTION = "Releases is a Python 2+3 compatible `Sphinx <http://sphinx-doc.org>`_ extension \
designed to help you keep a source control friendly, merge friendly changelog \
file & turn it into useful, human readable HTML output. \
 \
Specifically: \
 \
* The source format (kept in your Sphinx tree as ``changelog.rst``) is a \
  stream-like timeline that plays well with source control & only requires one \
  entry per change (even for changes that exist in multiple release lines). \
* The output (when you have the extension installed and run your Sphinx build \
  command) is a traditional looking changelog page with a section for every \
  release; multi-release issues are copied automatically into each release. \
* By default, feature and support issues are only displayed under feature \
  releases, and bugs are only displayed under bugfix releases. This can be \
  overridden on a per-issue basis."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "python39-releases-2.1.1-1.1.noarch.rpm"
RPM_HASH = "ddba66f7b2528c4e6753f2312dd14119e79e52b30b38a0bccfa84575e89cb750b52455cc77523e4bfeeb6000bd4748a01790c8d494e64f20952f8e7ea0833f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(releases) \
python39-releases \
python3dist(releases)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx \
python39-semantic_version"

inherit rpm
