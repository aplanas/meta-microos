SUMMARY = "Run your GitHub Actions locally"
DESCRIPTION = "act helps you run your Github Actions locally."
LICENSE = "MIT"

PV = "0.2.45"

RPM_NAME = "act-0.2.45-1.1.aarch64.rpm"
RPM_HASH = "ba3cd1618ab0a49220bf86c19cadbb2b4ee51b73eca5d7b27738aaa6e04136a4291850de663499465e2fe1f1471bc06ec07ffd9e02bfe4568f638ce35f605e39"

RPROVIDES:${PN} += "act act(aarch-64)"
RDEPENDS:${PN} += "docker"

inherit rpm
