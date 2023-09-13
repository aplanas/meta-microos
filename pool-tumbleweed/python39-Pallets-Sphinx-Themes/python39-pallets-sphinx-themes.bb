SUMMARY = "Themes for the Pallets projects"
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python39-Pallets-Sphinx-Themes-2.1.1-1.1.noarch.rpm"
RPM_HASH = "f57f68a320710134261060e77696d78d33ab516e4a391b3a3db7633882225526a77b8e7be3b40d15f578baa5a8f9f707a9ea981f909dcbc684bb967656f6d49e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pallets-sphinx-themes \
python39-Pallets-Sphinx-Themes \
python3dist-pallets-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-packaging"

inherit rpm
