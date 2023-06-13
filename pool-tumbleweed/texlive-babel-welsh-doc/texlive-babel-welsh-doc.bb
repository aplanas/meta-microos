SUMMARY = "Documentation for texlive-babel-welsh"
DESCRIPTION = "This package includes the documentation for texlive-babel-welsh"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn38372"

RPM_NAME = "texlive-babel-welsh-doc-2023.201.1.1asvn38372-53.1.noarch.rpm"
RPM_HASH = "a5b6eb9dadb77a7ba52acec6b6a4c08f51a720f8fa10c7ef74307364df17f3c1a1d9bf951e679d95b739e23fa55008098d425abb9d3db19ccc1844296b87be6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-welsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
