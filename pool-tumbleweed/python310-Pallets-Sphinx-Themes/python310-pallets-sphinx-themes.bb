SUMMARY = "Themes for the Pallets projects"
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python310-Pallets-Sphinx-Themes-2.1.1-1.1.noarch.rpm"
RPM_HASH = "78c25deb1bd1fd201427899062eafb6b66459d5948d1ad0870609ecfcee053ea964686c1201281ae199fe8b57a1e09830fa6dd2432ffa1ebb1199c8b4544204c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pallets-sphinx-themes \
python310-Pallets-Sphinx-Themes \
python3dist-pallets-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-packaging"

inherit rpm
