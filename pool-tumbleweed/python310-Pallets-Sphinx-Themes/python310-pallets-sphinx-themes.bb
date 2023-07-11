SUMMARY = "Themes for the Pallets projects."
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-Pallets-Sphinx-Themes-2.1.0-1.3.noarch.rpm"
RPM_HASH = "2e3e0d911592ea82b3d7152e9752207e279a7675f2bf88fcb2cd6adc2dc23d4a8ee72113ed612f49e8e5fe3e3a11ecc1c690229726dc006846d93677b44e3359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pallets-sphinx-themes \
python310-Pallets-Sphinx-Themes \
python3dist-pallets-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-packaging"

inherit rpm
