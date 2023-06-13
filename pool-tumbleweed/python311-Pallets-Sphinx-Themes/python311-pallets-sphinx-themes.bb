SUMMARY = "Themes for the Pallets projects."
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-Pallets-Sphinx-Themes-2.1.0-1.1.noarch.rpm"
RPM_HASH = "892e855feda1090da504731573dec85733632e6d7ebdde6017a11cf95e707a35143880b56c9ef66aaa527be893f1efbfad2fb3a640147f5e39c0296dcf66e4dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pallets-sphinx-themes) \
python311-Pallets-Sphinx-Themes \
python3dist(pallets-sphinx-themes)"

RDEPENDS:${PN} += "python(abi) \
python311-Sphinx \
python311-packaging"

inherit rpm
