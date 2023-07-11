SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "9.11"

RPM_NAME = "python39-pymdown-extensions-9.11-1.3.noarch.rpm"
RPM_HASH = "c81ebdbc003d8d2e8af09176ddf3d23a4d3121c71c58797213eb386573ce5cfc1485297593fb2cb25abde1dac99982e943a3dc8c3d76725ba28d93b4a05e6be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymdown-extensions \
python39-pymdown-extensions \
python3dist-pymdown-extensions"

RDEPENDS:${PN} += "python-abi \
python39-Markdown \
python39-PyYAML"

inherit rpm
