SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "Extension pack for Python Markdown"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-mkdocs-material-extensions-1.1.1-2.2.noarch.rpm"
RPM_HASH = "6d5a9685d1efe0fa7bd90b469500f7a4b8469d4fde720e044112ff8ac4a3b04e5d5f1603329a2078e2528611a648522ce444c05141e5d2e34cb88a7ae1219338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mkdocs-material-extensions \
python39-mkdocs-material-extensions \
python3dist-mkdocs-material-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
