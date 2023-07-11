SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "9.11"

RPM_NAME = "python311-pymdown-extensions-9.11-1.3.noarch.rpm"
RPM_HASH = "fb03e05538e1f8be0752043510abd375d52ce898a801fc084d849ee1b3c8816d64530a976b516e3da2f26927053a080c6615e21ac346483f8430e15fee82b67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymdown-extensions \
python3.11dist-pymdown-extensions \
python311-pymdown-extensions \
python3dist-pymdown-extensions"

RDEPENDS:${PN} += "python-abi \
python311-Markdown \
python311-PyYAML"

inherit rpm
