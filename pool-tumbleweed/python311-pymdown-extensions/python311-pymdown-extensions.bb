SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "10.3"

RPM_NAME = "python311-pymdown-extensions-10.3-1.1.noarch.rpm"
RPM_HASH = "ae2e6ea5a124bc9514531460dacc0df84a130ae105592bb75ab812ef3bbdd3bebb789f5830a09c42541806a5906165d0bf109bc31869ae28c936e76b5fe7241d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymdown-extensions \
python3.11dist-pymdown-extensions \
python311-pymdown-extensions \
python3dist-pymdown-extensions"

RDEPENDS:${PN} += "python-abi \
python311-Markdown \
python311-PyYAML"

inherit rpm
