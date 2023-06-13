SUMMARY = "Run commands and manipulate files locally or over SSH"
DESCRIPTION = "Run commands and manipulate files locally or over SSH using the same interface"
LICENSE = "BSD-2-Clause"

PV = "0.3.22"

RPM_NAME = "python310-spur-0.3.22-1.4.noarch.rpm"
RPM_HASH = "adc9b6fb106384c8effe69795c876bf34a68eff216688ec0490ba750fdce3a340c2e0a916392a539608aa9d75e2133df59ac22cd86b37643f152b34aef5faefa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spur \
python3.10dist(spur) \
python310-spur \
python3dist(spur)"

RDEPENDS:${PN} += "python(abi) \
python310-paramiko"

inherit rpm
