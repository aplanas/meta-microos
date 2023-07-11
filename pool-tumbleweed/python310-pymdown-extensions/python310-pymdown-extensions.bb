SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "9.11"

RPM_NAME = "python310-pymdown-extensions-9.11-1.3.noarch.rpm"
RPM_HASH = "17acf6af9bf4d95afc50825f7d253179cf7fcbfd16c2ac671f4390f30e6412b4502ca9123c3e72eb93044a2e2bf7efacd992c30baa266ea23811294e4b105371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymdown-extensions \
python310-pymdown-extensions \
python3dist-pymdown-extensions"

RDEPENDS:${PN} += "python-abi \
python310-Markdown \
python310-PyYAML"

inherit rpm
