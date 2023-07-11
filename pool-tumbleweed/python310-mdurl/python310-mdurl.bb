SUMMARY = "Markdown URL utilities"
DESCRIPTION = "A Python port of the JavaScript mdurl package. Formats and parses URLs in Markdown-Format."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-mdurl-0.1.2-2.3.noarch.rpm"
RPM_HASH = "a3b67fe17f23cd719101cf187768dd146bfbd9fce238e3722e483fb1bda7eca6757f8d02843e2aa3a5105638546dffbad03b27f80ef54030c87b596e06e054a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mdurl \
python310-mdurl \
python3dist-mdurl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
