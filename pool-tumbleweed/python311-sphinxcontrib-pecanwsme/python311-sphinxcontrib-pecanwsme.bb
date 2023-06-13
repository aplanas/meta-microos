SUMMARY = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
DESCRIPTION = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python311-sphinxcontrib-pecanwsme-0.10.0-3.1.noarch.rpm"
RPM_HASH = "a48a6875e5508f9a6297d730a359cef747c2c45f7c3cad49bca320f70133b390bb5e0543850cc0e35b9f1df503be53bc9becb4d95c9e58fb6f92a3beb97ce96d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-pecanwsme) \
python311-sphinxcontrib-pecanwsme \
python3dist(sphinxcontrib-pecanwsme)"

RDEPENDS:${PN} += "python(abi) \
python311-sphinxcontrib-httpdomain"

inherit rpm
