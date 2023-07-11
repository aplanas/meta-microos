SUMMARY = "Python Promises"
DESCRIPTION = "Promises implementation for python."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python310-vine-5.0.0-3.3.noarch.rpm"
RPM_HASH = "818c10b7a9004469706854e4889ad916d967dd2360fe591844c53637ea0ae4797217e24dd30fdfd21998b64694b2cf7a3369ae6e15553a57fd7dd7842de3d1d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vine \
python310-vine \
python3dist-vine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
