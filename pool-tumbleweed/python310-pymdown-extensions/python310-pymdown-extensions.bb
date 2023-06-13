SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "9.11"

RPM_NAME = "python310-pymdown-extensions-9.11-1.1.noarch.rpm"
RPM_HASH = "15fbb91cfb619f95afb5ddf7a1adc3043ea904382958fd9976c736183277d54f1083416bd92d47e9b64de0fecba518093a2c6c1da0289467068e56d2fcf6d563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymdown-extensions \
python3.10dist(pymdown-extensions) \
python310-pymdown-extensions \
python3dist(pymdown-extensions)"

RDEPENDS:${PN} += "python(abi) \
python310-Markdown \
python310-PyYAML"

inherit rpm
