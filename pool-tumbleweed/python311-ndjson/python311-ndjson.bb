SUMMARY = "JsonDecoder for ndjson"
DESCRIPTION = "JsonDecoder for ndjson"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python311-ndjson-0.3.1-1.3.noarch.rpm"
RPM_HASH = "472b11946fefb65785ba0718dcc15ed02ebcc48ffba0bca772970939e5c6dc5a29c6cda03cd9238c6ee614fa4dc64a94fa40558cd40ff47ac66f916da5b12cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ndjson) \
python311-ndjson \
python3dist(ndjson)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
