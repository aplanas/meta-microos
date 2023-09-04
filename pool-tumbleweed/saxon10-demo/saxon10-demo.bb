SUMMARY = "Demos for saxon10"
DESCRIPTION = "Demonstrations and samples for saxon10."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "10.9"

RPM_NAME = "saxon10-demo-10.9-1.1.noarch.rpm"
RPM_HASH = "0db120ec4299f32ab074a2bdea2f9e02d2fc93d468ee03590e27e8c645d190b1eea0ab7906af1d9fd9f13de94279979dc2788eec172fd2931b1fac743fc2cc6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon10-demo"

RDEPENDS:${PN} += "saxon10"

inherit rpm
