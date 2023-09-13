SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python39-contextvars-2.4-5.1.noarch.rpm"
RPM_HASH = "4373198743b357da90e6e3016c11a34a2308f28d71388278b7774b34f777a57cb41b5fd7bdbf64cf8b736659e3abb1b959895d8de2ba60039967b9d48ee266dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-contextvars \
python39-contextvars \
python3dist-contextvars"

RDEPENDS:${PN} += "python-abi \
python39-immutables"

inherit rpm
