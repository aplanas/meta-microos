SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "9.11"

RPM_NAME = "python39-pymdown-extensions-9.11-1.1.noarch.rpm"
RPM_HASH = "8dce33131099946d335805ebe8eb3845119ac3532140defd048cfaa8fc8c5dab745d9b0f8993910be153c434560ce9bea827aca499e0b5511950ac7df4b128ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymdown-extensions \
python39-pymdown-extensions \
python3dist-pymdown-extensions"

RDEPENDS:${PN} += "python-abi \
python39-Markdown \
python39-PyYAML"

inherit rpm
