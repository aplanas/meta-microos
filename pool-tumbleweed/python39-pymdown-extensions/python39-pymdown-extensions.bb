SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "10.3"

RPM_NAME = "python39-pymdown-extensions-10.3-1.1.noarch.rpm"
RPM_HASH = "344f4d111a6b327936c8622b945f5161b630ad671db6289a41d58f64194b8d9f9b02ece82de99e9d62872934b8b84782cec1cc286fb1a05e0502cddd857d7851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymdown-extensions \
python39-pymdown-extensions \
python3dist-pymdown-extensions"

RDEPENDS:${PN} += "python-abi \
python39-Markdown \
python39-PyYAML"

inherit rpm
