SUMMARY = "S-expressions tool for Numpy"
DESCRIPTION = "Snuggs are s-expressions for Numpy."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "python311-snuggs-1.4.7-2.9.noarch.rpm"
RPM_HASH = "26230cc781ac249adf29603863ddf37194c360c9b9d4ae80f5dcc28b2e6ae82ef89198a5a344cefacc53819da491aefa7f63056b0e96c3e321b7eddad8bf1306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-snuggs \
python3.11dist-snuggs \
python311-snuggs \
python3dist-snuggs"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-pyparsing"

inherit rpm
