SUMMARY = "A pure Python Levenshtein implementation"
DESCRIPTION = "A pure Python Levenshtein implementation."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python39-pylev-1.4.0-2.2.noarch.rpm"
RPM_HASH = "810f87c87e2cdac8146faa0addf8b5dd23e41742c531a9813a476e05fe8ea759730e017942b2c8342380a4b034306b0aa06df4e414f506619357256f4c4866d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylev \
python39-pylev \
python3dist-pylev"

RDEPENDS:${PN} += "python-abi"

inherit rpm
