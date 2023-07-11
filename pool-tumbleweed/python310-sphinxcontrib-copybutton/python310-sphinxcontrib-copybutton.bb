SUMMARY = "Add a copy button to each of your code cells"
DESCRIPTION = "Add a copy button to each of your code cells."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-sphinxcontrib-copybutton-0.5.1-2.3.noarch.rpm"
RPM_HASH = "4b153e60421dfdded36a5aadef58d1f2450f5f809d0249f0c5982c0da73bd5624ee099a609a1b2893e0a89ad591c406d8b6b72111cef7e1bac07e79aee3c4634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-copybutton \
python310-sphinxcontrib-copybutton \
python3dist-sphinx-copybutton"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
