SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "10.3"

RPM_NAME = "python310-pymdown-extensions-10.3-1.1.noarch.rpm"
RPM_HASH = "d28645c4ce79cc9bb19f2042f8c5a27763f0d43bf81459bbe13c8d1cf5aa70cafb14202cb7308ca4699d625338b59bd502893538cc761be9b5218d590a27d1c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymdown-extensions \
python310-pymdown-extensions \
python3dist-pymdown-extensions"

RDEPENDS:${PN} += "python-abi \
python310-Markdown \
python310-PyYAML"

inherit rpm
