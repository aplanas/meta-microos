SUMMARY = "Simple library to encode/decode DNS wire-format packets"
DESCRIPTION = "Simple library to encode/decode DNS wire-format packets."
LICENSE = "BSD-2-Clause"

PV = "0.9.23"

RPM_NAME = "python311-dnslib-0.9.23-1.3.noarch.rpm"
RPM_HASH = "c8abc031d639831d973948af6cb1b55adc8dfe563625cbed6af1857297e8ee200574d7cade4a94bfccbe36e81538d5f713716761aac09c23217d304988137662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dnslib) \
python311-dnslib \
python3dist(dnslib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
