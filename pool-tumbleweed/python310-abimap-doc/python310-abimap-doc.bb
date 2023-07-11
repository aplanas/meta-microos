SUMMARY = "Symbol versioning helper (Documentation)"
DESCRIPTION = "Documentation for the symbol versioning helper python310-abimap"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-abimap-doc-0.3.2-3.12.noarch.rpm"
RPM_HASH = "0424f92d84cf9c9931cd8a8b078525466b230eca5492e96af779882b669de9271e1feb032c7bf4efe73f4594fc7e4e1c26ea6ed7ffeca1000f7120992d98b571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-abimap-doc"

RDEPENDS:${PN} += ""

inherit rpm
