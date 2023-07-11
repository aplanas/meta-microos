SUMMARY = "Python language and compatibility facilities"
DESCRIPTION = "twitter.commonn.lang is a Python library for language and compatibility \
facilities. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python39-twitter.common.lang-0.3.11-1.16.aarch64.rpm"
RPM_HASH = "15cf95e39d471a3dd9737661b9bdfdbc5a6e4f1fc7205d006337537f3dacb2c7aa8c2cb93c074943ac535594e3bd346aa663b234394502e5c069c316665a58f7"

RPROVIDES:${PN} += "python3.9dist-twitter.common.lang \
python39-twitter.common.lang \
python3dist-twitter.common.lang"

RDEPENDS:${PN} += "python-abi"

inherit rpm
