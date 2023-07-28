SUMMARY = "Tools and API to assist with translation and software localization -- API docs"
DESCRIPTION = "The translate-toolkit-devel-doc package contains Translate Toolkit API documentation for developers wishing to build new tools for the \
toolkit or to use the libraries in other localization tools."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.2"

RPM_NAME = "translate-toolkit-devel-doc-3.9.2-1.1.noarch.rpm"
RPM_HASH = "bc5b9240d680f0ccc1d9bce39870c202689637790ec09344c173971c40002df128b8f8851ed1b01cb93c702a5ee7b712b64415d8d0dae091412d91d6e7ecf388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-toolkit-devel \
translate-toolkit-devel-doc"

RDEPENDS:${PN} += "translate-toolkit \
translate-toolkit-doc"

inherit rpm
