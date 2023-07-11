SUMMARY = "Documentation and examples for python310-watchdog"
DESCRIPTION = "This package contains documentation and examples for python310-watchdog."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-watchdog-doc-3.0.0-2.3.noarch.rpm"
RPM_HASH = "35f6c8b215846ec852a62dcec8658061909b38dc46a4397d4bfd54a3358eb98a1cd968ad679ab579fdd24808c34c2626b66d3b185cdd61af1de55516d51b971f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-watchdog-doc"

RDEPENDS:${PN} += ""

inherit rpm
