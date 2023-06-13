SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "9.11"

RPM_NAME = "python311-pymdown-extensions-9.11-1.1.noarch.rpm"
RPM_HASH = "20527413ba18f0a905692b05420059bfa83ab6521e1c036e1e05351dce34a7fe2ca1501e36e8f35bebb4c2a2a6ade7f748165eae15239eb37b8763cfedb3c579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pymdown-extensions) \
python311-pymdown-extensions \
python3dist(pymdown-extensions)"

RDEPENDS:${PN} += "python(abi) \
python311-Markdown \
python311-PyYAML"

inherit rpm
