SUMMARY = "Natural forces stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-naturalforces package contains a set of 'Rubber Stamp' \
images which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-naturalforces-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "69947afc49c8f23fa45e6931e6711f650aa2f16b523aebe0d8c0bd2b8410a3f1f74ddabc05098cb99e62d8b7ecbda0a17a2136b8904cc277ebd38622c15824a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-naturalforces"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
