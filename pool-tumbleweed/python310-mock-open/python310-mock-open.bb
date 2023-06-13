SUMMARY = "A better mock for file I/O"
DESCRIPTION = "A better mock for file I/O"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-mock-open-1.4.0-2.11.noarch.rpm"
RPM_HASH = "aca686276b70070d1592ab0c139506b070fd0341f2a008b5fd9e22c3313d707ba60752aa6c387153b4ffa68b68236e5721a2848cf1259acf01e28818d0f92a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mock-open \
python3.10dist(mock-open) \
python310-mock-open \
python3dist(mock-open)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
