SUMMARY = "Core Schema for Core API"
DESCRIPTION = "Core Schema for Core API, a format-independent Document Object Model for \
representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "0.0.4"

RPM_NAME = "python311-coreschema-0.0.4-2.1.noarch.rpm"
RPM_HASH = "acdb93fa6187e867cb71cd319997f9ae114ba3e357c2aa2c3565df60df8cdaad9a1412ed39b47748d4f29740492239daea834e09713c90dd7cba9f223cefea21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coreschema \
python3.11dist-coreschema \
python311-coreschema \
python3dist-coreschema"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2"

inherit rpm
