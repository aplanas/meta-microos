SUMMARY = "Tools and API to assist with translation and software localization -- HTML docs"
DESCRIPTION = "The translate-toolkit-doc package contains Translate Toolkit documentation in HTML format."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.6"

RPM_NAME = "translate-toolkit-doc-3.8.6-1.2.noarch.rpm"
RPM_HASH = "ba7baa6b2fae9c4e75a53fc112f0881ad09e6bf45d5dc40755a8ad5efbcad5d93536044ab18c566a1e5021dd39a254c8a6e799c9526c6ead136de93deb94a369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-toolkit-doc"

RDEPENDS:${PN} += "translate-toolkit"

inherit rpm
