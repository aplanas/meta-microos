SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-stack-data-0.6.2-2.1.noarch.rpm"
RPM_HASH = "c7a7c6193037cc5aa1a11f681acaa689319f06125c20c8248089354ea9e33a1e0ba69e0ec0d8ddf817fc1740a4d96d612ef5f6d953f4017e2eefa987a38d474c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(stack-data) \
python311-stack-data \
python3dist(stack-data)"
RDEPENDS:${PN} += "python(abi) \
python311-asttokens \
python311-executing \
python311-pure-eval"

inherit rpm
