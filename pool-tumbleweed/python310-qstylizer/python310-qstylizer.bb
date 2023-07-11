SUMMARY = "Stylesheet Generator for PyQt{4-5}/PySide{1-2}"
DESCRIPTION = "A python package designed to help with the construction of PyQt/PySide stylesheets."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-qstylizer-0.2.2-1.5.noarch.rpm"
RPM_HASH = "38c15cdc046033abeb31914f0157edb9cc8d952665fa640832bec7281e5de21a6d67553c7112057955331a78ff6d79a6cf6fed06ee6ee691929795d388e7eb9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qstylizer \
python310-qstylizer \
python3dist-qstylizer"

RDEPENDS:${PN} += "python-abi \
python310-inflection \
python310-tinycss2"

inherit rpm
