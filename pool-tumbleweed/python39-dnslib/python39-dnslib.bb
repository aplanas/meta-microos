SUMMARY = "Simple library to encode/decode DNS wire-format packets"
DESCRIPTION = "Simple library to encode/decode DNS wire-format packets."
LICENSE = "BSD-2-Clause"

PV = "0.9.23"

RPM_NAME = "python39-dnslib-0.9.23-1.3.noarch.rpm"
RPM_HASH = "1db6e28a5f245d0130a21fde555b8bca1bd89c4b093d046395eabc7f0d5f1b0dd33970bc957cd1312e52085a8e127c310e61ed393cc3ee6696bdc70f4e050b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dnslib) \
python39-dnslib \
python3dist(dnslib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
