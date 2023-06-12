SUMMARY = "Logos for openSUSE Kubic"
DESCRIPTION = "Logos for openSUSE Kubic"
LICENSE = "CC-BY-SA-4.0"

PV = "20220322"

RPM_NAME = "distribution-logos-openSUSE-Kubic-20220322-1.5.noarch.rpm"
RPM_HASH = "053ca10391ae1f523b124b81bd30410bcbb3cc814c5729b765e08032f8c06c11e91f66f786ac797f22acff31670da53771d5704eda95d5512bbc1cb7cef58a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos \
distribution-logos-openSUSE-Kubic"
RDEPENDS:${PN} += ""

inherit rpm
