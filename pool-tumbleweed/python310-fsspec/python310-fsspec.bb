SUMMARY = "Filesystem specification package"
DESCRIPTION = "A specification for pythonic filesystems."
LICENSE = "BSD-3-Clause"

PV = "2023.3.0"

RPM_NAME = "python310-fsspec-2023.3.0-2.2.noarch.rpm"
RPM_HASH = "f603a91917ee36f5931f9e176029054e2038e57a4fa06406985c0619f94e3e69e0fecdff98c21472cdf836d28a7d56be880d344c82acfa702a6b4083201058b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fsspec \
python3.10dist(fsspec) \
python310-fsspec \
python3dist(fsspec)"
RDEPENDS:${PN} += "fuse \
python(abi)"

inherit rpm
