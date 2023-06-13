SUMMARY = "Python JSON decoder that can extract data from dirty input"
DESCRIPTION = "JSON decoder for Python that can extract data from dirty input."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python310-dirtyjson-1.0.8-1.3.noarch.rpm"
RPM_HASH = "22f57f07b9d2fd0a6afdc323e733ab75f6eed45856c3db28b66a15caf27c7da1dd8fdbd091859ccd3cb4a0a53d7ab54f913ef5953e91dfb0651eef1072b0bbd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dirtyjson \
python3.10dist(dirtyjson) \
python310-dirtyjson \
python3dist(dirtyjson)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
