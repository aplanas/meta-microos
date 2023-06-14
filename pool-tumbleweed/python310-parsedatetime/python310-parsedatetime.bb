SUMMARY = "Python module to parse human-readable date/time text"
DESCRIPTION = "A Python module to parse human-readable date/time strings."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "python310-parsedatetime-2.6-2.8.noarch.rpm"
RPM_HASH = "193a91a10c553cd0c7f2a1d07118c9af8e243d1e14e93d42cf564ec22f3461effe20a995a228c9c0b96361ca26f193a76c59acca3a5afce86dbf37ef3777288d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsedatetime \
python3.10dist-parsedatetime \
python310-parsedatetime \
python3dist-parsedatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
