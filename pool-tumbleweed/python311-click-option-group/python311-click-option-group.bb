SUMMARY = "Option groups missing in Click"
DESCRIPTION = "Option groups missing in Click"
LICENSE = "BSD-3-Clause"

PV = "0.5.5"

RPM_NAME = "python311-click-option-group-0.5.5-2.1.noarch.rpm"
RPM_HASH = "7eea13cd25410ff33920f66f21249f9d67303c83ce434bc05d3c4fffafd0de6ac4cd2ee69b9f59113fc0e787d2709ae381d7a9c740505deaed6274bebc2e3a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-option-group) \
python311-click-option-group \
python3dist(click-option-group)"

RDEPENDS:${PN} += "python(abi) \
python311-click"

inherit rpm
