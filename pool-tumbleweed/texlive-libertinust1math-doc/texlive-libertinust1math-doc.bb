SUMMARY = "Documentation for texlive-libertinust1math"
DESCRIPTION = "This package includes the documentation for texlive-libertinust1math"
LICENSE = "OFL-1.1"

PV = "2023.209.2.0.2svn61751"

RPM_NAME = "texlive-libertinust1math-doc-2023.209.2.0.2svn61751-55.1.noarch.rpm"
RPM_HASH = "56db40b9633c2fa99f33db91cc45385229613d3f851b72102538853a44eaa2496778cbce59d5e1a26e7aebd9c9e28b97d9f53b16d58ba11745c3a0be881f7711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinust1math-doc"

RDEPENDS:${PN} += ""

inherit rpm
