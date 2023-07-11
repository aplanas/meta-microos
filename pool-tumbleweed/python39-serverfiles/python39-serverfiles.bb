SUMMARY = "A utility to locally store files on a HTTP server"
DESCRIPTION = "A utility that accesses files on an HTTP server and stores them \
locally for reuse."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python39-serverfiles-0.3.1-1.10.noarch.rpm"
RPM_HASH = "2e34469ac44c54d95df3536635b9c2ebe0a6cdf8efe7a39feab89a4fe33efb4170b5ab1e92617fc12eadab608053f58adc2b899a7625741284d4a73dc70588b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-serverfiles \
python39-serverfiles \
python3dist-serverfiles"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
