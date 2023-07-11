SUMMARY = "JsonDecoder for ndjson"
DESCRIPTION = "JsonDecoder for ndjson"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python311-ndjson-0.3.1-1.5.noarch.rpm"
RPM_HASH = "98918b145fa4f33f5fcd1c26308109b8b783bd0f717bff753f1f1d07e57419bf42a3851eca17cec1594950c046220ac7f458198ee860aab867d56a6de2d61abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ndjson \
python3.11dist-ndjson \
python311-ndjson \
python3dist-ndjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
