SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-doc-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "bacd91bbac342d4e41ceb3e8d13a9b00dccd1e064733e0bbb4610a4c4d3463d74c74fc685c773ca2cd9f26d4968f46a26b377a56db317f787b2fac0a59b0a29b"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
