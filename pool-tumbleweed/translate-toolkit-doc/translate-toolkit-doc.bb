SUMMARY = "Tools and API to assist with translation and software localization -- HTML docs"
DESCRIPTION = "The translate-toolkit-doc package contains Translate Toolkit documentation in HTML format."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.2"

RPM_NAME = "translate-toolkit-doc-3.9.2-1.1.noarch.rpm"
RPM_HASH = "2c7fed0efb09a828cf16cbb4c91dc2cbe2359c48bad1475015106088b4acc80e8c0c4b4f45c3220e45c6b640ff58085b1f531d91c813b89b31b8840c26051bcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-toolkit-doc"

RDEPENDS:${PN} += "translate-toolkit"

inherit rpm
