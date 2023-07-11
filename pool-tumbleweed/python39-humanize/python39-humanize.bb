SUMMARY = "Python humanize utilities"
DESCRIPTION = "This modest package contains various common humanization utilities, like turning \
a number into a fuzzy human readable duration ('3 minutes ago') or into a human \
readable size or throughput."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python39-humanize-4.4.0-1.5.noarch.rpm"
RPM_HASH = "489d5e820e1bd4e975b19fe7c0b19e3c5eb5272d94eb034db06d52b4ae31ab7454a7dec18ac10689fbdfd41d4c097a89829c186205201063ce5ec2c086bef1e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-humanize \
python39-humanize \
python3dist-humanize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
