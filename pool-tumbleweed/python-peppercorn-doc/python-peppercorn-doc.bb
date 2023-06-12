SUMMARY = "Documentation for Pyramid exceptions logger"
DESCRIPTION = "This package contains documentation for python-peppercorn."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python-peppercorn-doc-0.6-4.1.noarch.rpm"
RPM_HASH = "6d4bf78873f548ef42222f8ac0a27dddbb9010ac659534e107740e495dfb2283ab7bb286d0432bf0c70cee5c822c2bfa6c6dfd0204dce84436929850522228b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-peppercorn-doc"
RDEPENDS:${PN} += ""

inherit rpm
