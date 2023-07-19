SUMMARY = "Shell bindings for subunit"
DESCRIPTION = "Subunit shell bindings.  See the python3-python-subunit package for test \
processing functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-shell-1.4.2-3.1.noarch.rpm"
RPM_HASH = "5ce4299678878da94d17e9c485284a717a6dcbb9dc0387ca445acdab3652f2e2f41aa391c1b635159d267799099cca9f0b2ddf292a0d8656383ad58858bffee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-subunit-shell \
subunit-shell"

RDEPENDS:${PN} += ""

inherit rpm
