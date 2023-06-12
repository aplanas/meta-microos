SUMMARY = "A variant of pprint that is arguably 'prettier'"
DESCRIPTION = "A drop-in replacement for pprint that is arguably prettier."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "python39-pprintpp-0.4.0-6.2.noarch.rpm"
RPM_HASH = "6efb060b2791fb8f30187d95e20e756a3122a4d50843d27ee7a3980f45bbeaf63b416e27a32c74d307c7881265c431f86b5914ae517d0a940905df3b6223ca19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pprintpp) \
python39-pprintpp \
python3dist(pprintpp)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
